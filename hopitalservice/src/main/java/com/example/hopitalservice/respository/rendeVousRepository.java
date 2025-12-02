package com.example.hopitalservice.respository;

import com.example.hopitalservice.model.rendezVous;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rendeVousRepository extends JpaRepository<rendezVous, Integer> {
}
