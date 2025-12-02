package com.example.hopitalservice.controller;

import com.example.hopitalservice.dto.addrendezevousrequest;
import com.example.hopitalservice.model.rendezVous;
import com.example.hopitalservice.respository.rendeVousRepository;
import com.example.hopitalservice.service.rendezVousService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hopital/rendezvous")
@RequiredArgsConstructor
public class rendezVousController {

    private final rendezVousService service;

    @GetMapping("/getall")
    public ResponseEntity<List<rendezVous>> rendezVous()
    {
        return ResponseEntity.ok(service.gatall())   ;
    }

    @GetMapping("/getbymedcin/{medcin_id}")
    public ResponseEntity<List<rendezVous>> getbymedcin(@PathVariable int medcin_id)
    {
        return ResponseEntity.ok(service.getbymedcin(medcin_id))   ;
    }

    @PostMapping("/add")
    public ResponseEntity<Integer> add(@RequestBody addrendezevousrequest rendezvous)
    {
        return   ResponseEntity.ok(service.add(rendezvous))  ;
    }
}
