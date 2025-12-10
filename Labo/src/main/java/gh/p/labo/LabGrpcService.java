package gh.p.labo;







import com.example.labo.grpc.*;

import gh.p.labo.entity.Status;
import gh.p.labo.entity.TestRequest;
import gh.p.labo.respository.TestRequestRepository;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class LabGrpcService extends LabServiceGrpc.LabServiceImplBase {

    private final TestRequestRepository repository;

    public LabGrpcService(TestRequestRepository repository) {
        this.repository = repository;
    }


    @Override
    public void submitTestRequest(SubmitRequest request, StreamObserver<TestResponse> responseObserver) {
        // 1. Créer l'entité JPA à partir du message gRPC
        TestRequest newRequest = new TestRequest();
        newRequest.setPatientName(request.getPatientName());
        newRequest.setTestType(request.getTestType());
        newRequest.setStatus(Status.PENDING); // Initial status

        // 2. Sauvegarder dans la base de données
        TestRequest savedRequest = repository.save(newRequest);

        // 3. Renvoyer la réponse gRPC
        TestResponse response = TestResponse.newBuilder()
                .setRequestId(savedRequest.getId())
                .setPatientName(savedRequest.getPatientName())
                .setTestType(savedRequest.getTestType())
                .setStatus(savedRequest.getStatus().name())
                .setResultDetails("Demande de test soumise.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getTestResult(GetRequest request, StreamObserver<TestResponse> responseObserver) {
        Optional<TestRequest> optionalRequest = repository.findById(request.getRequestId());

        if (optionalRequest.isPresent()) {
            TestRequest foundRequest = optionalRequest.get();

            TestResponse response = TestResponse.newBuilder()
                    .setRequestId(foundRequest.getId())
                    .setPatientName(foundRequest.getPatientName())
                    .setTestType(foundRequest.getTestType())
                    .setStatus(foundRequest.getStatus().name())
                    // Ajoutez la logique pour le champ result_details si besoin (non modélisé dans l'entité simple ci-dessus)
                    .setResultDetails("Statut actuel: " + foundRequest.getStatus().name())
                    .build();

            responseObserver.onNext(response);
        } else {
            TestResponse response = TestResponse.newBuilder()
                    .setRequestId(request.getRequestId())
                    .setStatus("ERROR")
                    .setResultDetails("Demande de test non trouvée.")
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }
    // L'implémentation de UpdateTestStatus serait similaire, utilisant repository.findById, modification, et repository.save
}