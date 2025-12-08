package com.example.clientservice.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class addDoctorNoteDto {
    private int patientId  ;
    private int  doctorId;
    private String content;
    private LocalDateTime createdAt;


}
