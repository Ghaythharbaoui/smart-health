package com.example.assuranceservice.repository;

import com.example.assuranceservice.model.transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface transactionRepository extends JpaRepository<transaction, Integer> {

    List<transaction> findAllByPatientId(Integer id);

}
