package com.example.hopitalservice.respository;

import com.example.hopitalservice.model.medcin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface medcinRepository extends JpaRepository<medcin, Integer> {

}
