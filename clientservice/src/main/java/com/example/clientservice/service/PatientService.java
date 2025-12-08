package com.example.clientservice.service;

import com.example.clientservice.Dto.addDoctorNoteDto;
import com.example.clientservice.Repository.patientRepository;
import com.example.clientservice.model.DoctorNote;
import com.example.clientservice.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class  PatientService {
    private final patientRepository repository;
    private final DoctorNoteService doctorNoteService;
    private final AllergyService allergyService;
    public String patient()
    {
        return "hellow world";
    }

    public Patient getByid(int id)
    {
        return  repository.findByPatientid(id).get()  ;
    }

    public Patient addDoctornote(addDoctorNoteDto addDoctorNoteDto)
    {
        Patient patient =  repository.findByPatientid(addDoctorNoteDto.getPatientId()).get() ;
        DoctorNote doctorNote = doctorNoteService.add( addDoctorNoteDto ) ;
        patient.getDoctorsNotes().add(doctorNote);
        return repository.save(patient) ;
    }
}
