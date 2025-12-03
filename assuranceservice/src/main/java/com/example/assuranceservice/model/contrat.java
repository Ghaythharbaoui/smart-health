package com.example.assuranceservice.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@XmlRootElement(name = "contrat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class contrat {
    @Id
    @GeneratedValue
    private int contratId  ;
    private int patientId ;
    private Date contratStartDate;
    private Date contratEndDate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL )
    private companyAssurance companyAssurance;

}
