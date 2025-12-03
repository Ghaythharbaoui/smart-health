package com.example.assuranceservice.dto;

import com.example.assuranceservice.model.transactionType;
import jakarta.persistence.Entity;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@XmlRootElement(name = "addtransaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class addtransaction {
    private Date transaction_date;
    private int patient_id   ;
    private int transaction_type_id;

}
