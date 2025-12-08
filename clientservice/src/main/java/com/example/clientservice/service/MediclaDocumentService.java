package com.example.clientservice.service;

import com.example.clientservice.Dto.addMedicalDocumentDto;
import com.example.clientservice.Repository.MedicalDocumentRepository;
import com.example.clientservice.model.MedicalDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MediclaDocumentService {
    private final MedicalDocumentRepository repository  ;

    public MedicalDocument add(addMedicalDocumentDto addMedicalDocumentDto)
    {
        MedicalDocument medicalDocument = new MedicalDocument();
        medicalDocument.setTitle(addMedicalDocumentDto.getTitle());
        medicalDocument.setType(addMedicalDocumentDto.getType());
        medicalDocument.setUrl(addMedicalDocumentDto.getUrl());
        medicalDocument.setUploadDate(addMedicalDocumentDto.getUploadDate());
        repository.save(medicalDocument);
        return medicalDocument;
    }


}
