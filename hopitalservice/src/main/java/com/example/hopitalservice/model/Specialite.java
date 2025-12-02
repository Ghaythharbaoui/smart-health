package com.example.hopitalservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Specialite {
    @Id
    int specialite_id  ;
    String specialite_name ;
    @OneToMany
    private List<medcin> medcins   ;
}
