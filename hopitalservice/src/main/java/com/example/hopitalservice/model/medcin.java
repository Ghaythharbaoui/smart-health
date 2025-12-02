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
    private String medcin_id;
    private String medcin_firstname;
    private String medcin_lastname;
    @ManyToOne
    @JoinColumn(name = "specialite_id")
    private Specialite medcin_specialite    ;
    @OneToMany
    private List<rendezVous> rendezVous ;
}
