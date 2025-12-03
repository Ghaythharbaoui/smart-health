package com.example.assuranceservice.repository;

import com.example.assuranceservice.model.companyAssurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface companyAssuranceRepository extends JpaRepository<companyAssurance, Integer> {
}
