package com.example.hopitalservice.controller;


import com.example.hopitalservice.model.Specialite;
import com.example.hopitalservice.model.medcin;
import com.example.hopitalservice.service.specialiteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hopital/specialite")
@AllArgsConstructor
public class specialiteController {
    private specialiteService service;

    @GetMapping("/getall")
    public ResponseEntity<List<Specialite>> getall()
    {
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/getbymedcin/{id}")
    public ResponseEntity<List<medcin>> getmedcins(@PathVariable int id)
    {
      return ResponseEntity.ok( service.getmedcins(id) ) ;
    }
    private void get()
    {
        service.findbyid(5)  ;
    }

}
