package com.example.hopitalservice.service;

import com.example.hopitalservice.model.Specialite;
import com.example.hopitalservice.model.medcin;
import com.example.hopitalservice.respository.specialiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class specialiteService {
    private final specialiteRepository repo;

    public List<Specialite> getAll() {
        return repo.findAll();
    }
    public Specialite findbyid(int id) {
        return repo.findById(id).get();
    }
    public List<medcin> getmedcins(int id) {
        return findbyid(id).getMedcins() ; 
    }
}
