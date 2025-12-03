package com.example.assuranceservice.service;

import com.example.assuranceservice.dto.addtransaction;
import com.example.assuranceservice.model.contrat;
import com.example.assuranceservice.model.transaction;
import com.example.assuranceservice.model.transactionType;
import com.example.assuranceservice.repository.companyAssuranceRepository;
import com.example.assuranceservice.repository.contractRepository;
import com.example.assuranceservice.repository.transactionRepository;
import com.example.assuranceservice.repository.transactionTypeRepository;
import jakarta.jws.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@WebService(endpointInterface = "com.example.assuranceservice.service.assuranceService")
@RequiredArgsConstructor
public class assuranceServiceImpl implements assuranceService {

   private final contractRepository contractRepository ;
    private final transactionRepository transactionRepository  ;
    private final transactionTypeRepository transactionTypeRepository ;

    @Override
    public List<transaction> getPatientTransaction(int patientId) {
        return transactionRepository.findAllByPatientId(patientId);
    }

    @Override
    public contrat getPatientContrat(int patientId) {
        return contractRepository.findByPatientId(patientId).get()    ;
    }

    @Override
    public int addtransactionPatient(addtransaction addtransaction) {
        transaction transaction = new transaction();
        transaction.setPatientId(addtransaction.getPatient_id());

        transaction.setTransactionDate(addtransaction.getTransaction_date());
        transactionRepository.save(transaction);
        return transaction.getTransactionId() ;

    }
}
