package com.example.clientservice.service;


import com.example.clientservice.Dto.addDoctorNoteDto;
import com.example.clientservice.Repository.DoctorNoteRepository;
import com.example.clientservice.model.DoctorNote;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorNoteService {
  private final DoctorNoteRepository repository;



  public DoctorNote add( addDoctorNoteDto addDoctorNoteDto ) {
      DoctorNote doctorNote = new DoctorNote();
      doctorNote.setDoctorId(addDoctorNoteDto.getDoctorId());
      doctorNote.setContent(addDoctorNoteDto.getContent());
      doctorNote.setCreatedAt(addDoctorNoteDto.getCreatedAt());
      return repository.save(doctorNote);

  }

}
