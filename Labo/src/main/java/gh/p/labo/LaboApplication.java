package gh.p.labo;

import gh.p.labo.respository.TestRequestRepository;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class LaboApplication {
	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(LaboApplication.class, args);


	}

}
