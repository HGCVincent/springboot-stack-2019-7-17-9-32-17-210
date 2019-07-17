package com.tw.apistackbase.RepositoryTest;


import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.repository.CriminalCaseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CriminalCaseTest {
    @Autowired
    CriminalCaseRepository criminalCaseRepository;


    @Test
    public void should_return_Case_when_give_case_id(){
        Date caseDate=new Date(1970,1,1);
        long caseTime=caseDate.getTime();
        CriminalCase criminalCase = new CriminalCase();
        criminalCase.setId(1);
        criminalCase.setCasename("连环杀人");

        criminalCaseRepository.save(criminalCase);
        CriminalCase criminalCase1 = criminalCaseRepository.findById(1).get();

        assertEquals("连环杀人",criminalCase1.getCasename());
    }
}
