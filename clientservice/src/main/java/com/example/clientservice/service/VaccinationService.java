package com.example.clientservice.service;

import com.example.clientservice.Dto.addVaccinationDto;
import com.example.clientservice.Repository.VaccinationRepository;
import com.example.clientservice.model.Vaccination;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VaccinationService {
    private final VaccinationRepository Repository;

    public Vaccination add(addVaccinationDto addVaccinationDto) {
        Vaccination vaccination = new Vaccination();
        vaccination.setVaccineName(addVaccinationDto.getVaccineName());
        vaccination.setVaccinationDate(addVaccinationDto.getVaccinationDate()) ;
        vaccination.setDoctorId(addVaccinationDto.getDoctorId());
        vaccination.setCenterName(addVaccinationDto.getCenterName());
        vaccination.setNotes(addVaccinationDto.getNotes());
        Repository.save(vaccination);
        return vaccination;
    }

}
