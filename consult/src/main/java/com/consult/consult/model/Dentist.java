package com.consult.consult.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;

    private String lastName;

    private String address;

    private String dni;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    private String phone;

    private String email;

    private String codeMp;

    @OneToMany
    @JoinColumn(name = "id", nullable=false)
    private Set<Diary> diaries = new HashSet<>(); 

}
