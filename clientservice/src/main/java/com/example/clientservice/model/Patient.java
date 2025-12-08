package com.example.clientservice.model;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "patient_table")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientid ;
    private int patientnumAssurance ;
    private String patienname ;
    private String patientaddress ;
    private String patientphone ;
    private String patientemail ;
    private int patientage ;
    @OneToMany
    private List<Allergy> allergies ;

    @OneToMany
    private List<Vaccination> Vacinations  ;

    @OneToMany
    private List<MedicalDocument> documents;

    @OneToMany
    private List<DoctorNote> doctorsNotes;

}
