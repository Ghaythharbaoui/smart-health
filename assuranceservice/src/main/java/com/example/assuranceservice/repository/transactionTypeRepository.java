package com.example.assuranceservice.repository;

import com.example.assuranceservice.model.transactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface transactionTypeRepository  extends JpaRepository<transactionType, Integer> {
    Optional<transactionType> findByTransactionTypeId(Integer transactionTypeId);
}
