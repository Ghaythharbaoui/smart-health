package gh.p.labo.config;

import gh.p.labo.LabGrpcService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class grpcserverConfig {

    private static final int GRPC_PORT = 9292;

    // Le service gRPC que vous voulez démarrer (injecté par Spring)
    private final LabGrpcService serviceGrpc;

    // Injection du service gRPC via le constructeur.
    // Spring le trouvera car il doit être défini comme un bean (voir point 2).
    public grpcserverConfig(LabGrpcService serviceGrpc) {
        this.serviceGrpc = serviceGrpc;
    }

    /**
     * Définit le serveur gRPC comme un bean Spring.
     * Le serveur est démarré juste après sa création.
     * @return Le serveur gRPC démarré
     * @throws IOException
     */
    @Bean(destroyMethod = "shutdown") // Ajoute destroyMethod pour l'arrêt propre
    public Server grpcServer() throws IOException {

        // Configuration et démarrage du serveur
        final Server server = ServerBuilder.forPort(GRPC_PORT)
                // Déploie votre service sur le serveur.
                .addService(serviceGrpc)
                // Optionnel: pour un thread pool dédié
                // .executor(Executors.newFixedThreadPool(10))
                .build();

        server.start();

        System.out.println("✅ Serveur gRPC démarré sur le port " + GRPC_PORT + "...");

        // NOTE: On ne fait PAS awaitTermination() ici car cela bloquerait
        // le thread principal de Spring Boot. Spring gère le cycle de vie.

        return server;
    }
}