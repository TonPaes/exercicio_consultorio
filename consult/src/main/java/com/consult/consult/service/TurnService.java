package com.consult.consult.service;

import java.util.Date;

import com.consult.consult.dto.AllPatientsByDayResponseDTO;

public interface TurnService {
    public AllPatientsByDayResponseDTO allPatientsByDate(Date date);
}
