package com.example.clientservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class addVaccinationDto {

    private int patientId   ;
    private String vaccineName;
    private LocalDate vaccinationDate;
    private int doctorId;
    private String centerName;
    private String notes;

}
