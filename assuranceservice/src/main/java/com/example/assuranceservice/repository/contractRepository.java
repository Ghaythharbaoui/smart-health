package com.example.assuranceservice.repository;

import com.example.assuranceservice.model.contrat;
import com.example.assuranceservice.model.transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface contractRepository extends JpaRepository<contrat, Integer> {
    Optional<contrat> findByPatientId(int id);
}
