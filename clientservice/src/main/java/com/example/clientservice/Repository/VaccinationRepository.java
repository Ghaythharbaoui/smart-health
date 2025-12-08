package com.example.clientservice.Repository;

import com.example.clientservice.model.Vaccination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRepository extends JpaRepository<Vaccination, Integer>
{
    
}
