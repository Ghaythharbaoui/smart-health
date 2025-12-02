package com.example.hopitalservice.service;

import com.example.hopitalservice.model.rendezVous;
import com.example.hopitalservice.respository.rendeVousRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class rendeezVousService {
    private final rendeVousRepository repo  ;
    private final medcinService medcinService ;
    public List<rendezVous>  gatall()
    {
       return repo.findAll();
    }
    public List<rendezVous> getbymedcin(int medcin_id )
    {
        return  medcinService.getMedcin(medcin_id).getRendezVous();
    }
    public int add()
    {

    }



}
