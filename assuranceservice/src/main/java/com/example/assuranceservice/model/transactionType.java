package com.example.assuranceservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@XmlRootElement(name = "transactionType")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class transactionType {
    @Id
    @GeneratedValue
    private int transactionTypeId;
    private String transactionTypeName;

}
