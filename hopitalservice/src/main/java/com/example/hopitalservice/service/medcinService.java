package com.example.hopitalservice.service;

import com.example.hopitalservice.model.medcin;
import com.example.hopitalservice.model.rendezVous;
import com.example.hopitalservice.respository.medcinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class medcinService {
    private final medcinRepository repo;

    public List<medcin> getAllMedcin() {
        return repo.findAll();
    }
    public medcin getMedcin(int id) {
        return repo.findById(id).get();
    }



    public List<rendezVous>  getrendezVous(int medcin_id) {
        return  getMedcin(medcin_id).getRendezVous();
    }

}
