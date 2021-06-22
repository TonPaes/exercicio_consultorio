package com.consult.consult.repository;

import com.consult.consult.model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends JpaRepository<Patient, Long>{
    
}
