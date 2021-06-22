package com.consult.consult.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
public class Turn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date day;

    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private Diary diary;

    @OneToOne
    @JoinColumn(name="id", nullable=false)
    private Patient patient;

    @OneToMany
    @JoinColumn(name="id", nullable=false)
    private Set<Status> statuses= new HashSet<>();

    
    
}
