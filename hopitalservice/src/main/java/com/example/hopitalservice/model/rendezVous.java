package com.example.hopitalservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity(name = "rendezVous_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class rendezVous {
    @Id
    int rendezVouId   ;
    @ManyToOne()
    private medcin medcins  ;
    private int patientId ;
    private LocalDateTime   rendezVous_dateheure ;
    @ManyToOne()
    @JoinColumn(name = "medcin_id")
    private medcin medcin  ;
}
