package com.example.clientservice.Repository;

import com.example.clientservice.model.DoctorNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorNoteRepository extends JpaRepository<DoctorNote, Integer> {
}
