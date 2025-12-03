package com.example.hopitalservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "medcin_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class medcin {
    @Id
    private String medcinId;
    private String medcinFirstname;
    private String medcinLastname;
    @ManyToOne
    @JoinColumn(name = "specialite_id")
    private Specialite medcin_specialite    ;
    @OneToMany
    private List<rendezVous> rendezVous ;
}
