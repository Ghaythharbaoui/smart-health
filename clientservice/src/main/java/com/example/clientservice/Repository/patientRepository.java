package com.example.clientservice.Repository;

import com.example.clientservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface patientRepository extends JpaRepository<Patient, Integer> {

    Optional<Patient>   findByPatientid (Integer patientId);
}
