package com.consult.consult.unit.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import com.consult.consult.dto.AllPatientsByDayResponseDTO;
import com.consult.consult.service.TurnService;
import com.consult.consult.service.TurnServiceImpl;
import com.consult.consult.unit.mocks.Mocks;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TurnServiceTest {
    
    TurnService turnService = new TurnServiceImpl();

    @Test
    void contextLoads(){

    }


    @Test
    void listAllPatientsAllDaysAllDentists(){

        AllPatientsByDayResponseDTO mokedResponse = Mocks.getAllPatientsByDayResponseDTO();


        Date mockDate = new Date(1624393063);
        AllPatientsByDayResponseDTO response = turnService.allPatientsByDate(mockDate);
        
        assertTrue(response.equals(mokedResponse));
    }
}
