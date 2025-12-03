package com.example.assuranceservice.service;

import com.example.assuranceservice.dto.addtransaction;
import com.example.assuranceservice.model.contrat;
import com.example.assuranceservice.model.transaction;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface assuranceService {

  @WebMethod
   List<transaction> getPatientTransaction(@WebParam(name = "transactionId") int transactionId) ;

    @WebMethod
    contrat getPatientContrat(@WebParam(name = "patientId") int patientId) ;

    @WebMethod
    int addtransactionPatient(@WebParam(name = "addtransaction") addtransaction addtransaction) ;




}
