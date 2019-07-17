package com.tw.apistackbase.RepositoryTest;


import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.repository.CriminalCaseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CriminalCaseTest {
    @Autowired
    CriminalCaseRepository criminalCaseRepository;


    @Test
    public void should_return_Case_when_give_case_id(){
        CriminalCase criminalCase = new CriminalCase();
        criminalCase.setId(1);
        criminalCase.setCasename("连环杀人");

        criminalCaseRepository.save(criminalCase);
        CriminalCase criminalCase1 = criminalCaseRepository.findById(1).get();

        assertEquals("连环杀人",criminalCase1.getCasename());
    }

    @Test
    public void should_return_all_case(){
        CriminalCase criminalCase = new CriminalCase();
        criminalCase.setId(1);
        criminalCase.setCasename("连环杀人");

        criminalCaseRepository.save(criminalCase);
        List<CriminalCase> cases = criminalCaseRepository.findAll();

        assertEquals("连环杀人",cases.get(0).getCasename());
    }


}
