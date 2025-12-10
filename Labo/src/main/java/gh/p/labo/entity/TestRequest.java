package gh.p.labo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "test_requests")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TestRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;

    private String testType;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDING;

    private LocalDateTime requestDate = LocalDateTime.now();

    // Getters and Setters (omitted for brevity)
    // ...
}