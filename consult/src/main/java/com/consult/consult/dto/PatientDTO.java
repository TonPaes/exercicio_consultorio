package com.consult.consult.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class PatientDTO {
    @JsonProperty("id_patient")
    private int idPatient;
    
    private String name;

    @JsonProperty("last_name")
    private String lastName;
    
    private String dni;
    
    @JsonProperty("birth_date")
    private Date birthDate;
    
    private String phone;
    
    private String email;
}
