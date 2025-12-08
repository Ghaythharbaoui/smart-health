package com.example.clientservice.Controller;

import com.example.clientservice.model.Patient;
import com.example.clientservice.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class PatitentController {

   private final PatientService patientService;

    @QueryMapping
    public Patient patient (@Argument int id)
    {
        return  patientService.getByid(id) ;
    }
}
