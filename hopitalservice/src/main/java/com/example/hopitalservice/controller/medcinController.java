package com.example.hopitalservice.controller;

import com.example.hopitalservice.model.medcin;
import com.example.hopitalservice.service.medcinService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/hopital/medcin")
@RequiredArgsConstructor
public class medcinController {
    private final medcinService service;
    @GetMapping("/getAll")
    public ResponseEntity<List<medcin>> getAll() {
       return   ResponseEntity.ok(service.getAllMedcin())  ;
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<medcin> getMedcinById(@PathVariable int id) {
        return  ResponseEntity.ok(service.getMedcin(id)) ;
    }


}
