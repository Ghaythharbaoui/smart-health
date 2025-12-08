package com.example.clientservice.Repository;

import com.example.clientservice.model.MedicalDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalDocumentRepository extends JpaRepository<MedicalDocument, Integer> {
}
