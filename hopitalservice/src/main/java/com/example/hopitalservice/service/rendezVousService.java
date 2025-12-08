package com.example.hopitalservice.service;

import com.example.hopitalservice.dto.addrendezevousrequest;
import com.example.hopitalservice.model.rendezVous;
import com.example.hopitalservice.respository.rendeVousRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class rendezVousService {
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
    public int add(addrendezevousrequest addrendezevousrequest)
    {
          rendezVous rendezVous = new rendezVous();
          rendezVous.setMedcin( medcinService.getMedcin(addrendezevousrequest.getMedcin_id()) );
          rendezVous.setPatientId(addrendezevousrequest.getRendezpatient_id());
          rendezVous.setRendezVous_dateheure(addrendezevousrequest.getRendezevous_timestamp());
          repo.save(rendezVous);
          return rendezVous.getRendezVouId() ;
    }



}
