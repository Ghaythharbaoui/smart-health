package com.example.hopitalservice.respository;

import com.example.hopitalservice.model.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface specialiteRepository extends JpaRepository<Specialite, Integer> {
}
