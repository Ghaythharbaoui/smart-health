package com.example.assuranceservice.model;


import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@XmlRootElement(name = "companyAssurance")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class companyAssurance   {
   @Id
   @GeneratedValue
   private int companyAssuranceId;
   private String companyName;
   private String companyAddress;




}
