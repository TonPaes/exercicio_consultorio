package com.consult.consult.repository;

import org.springframework.stereotype.Repository;

import com.consult.consult.model.Dentist;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {
    
}
