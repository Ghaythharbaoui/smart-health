package com.example.assuranceservice.model;


import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Entity
@XmlRootElement(name = "transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class transaction {
    @Id
    @GeneratedValue
    private int transactionId;
    private Date transactionDate;
////
//    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private companyAssurance assurance  ;
    private int patientId   ;
//
    @OneToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private transactionType transactionType;
}
