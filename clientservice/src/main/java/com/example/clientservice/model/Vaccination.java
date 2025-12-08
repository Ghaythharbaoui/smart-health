package com.example.clientservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vaccination {
      @Id
      @GeneratedValue
      private int id;
      private String vaccineName;
      private LocalDate vaccinationDate;
      private int doctorId;
      private String centerName;
      private String notes;


    }
