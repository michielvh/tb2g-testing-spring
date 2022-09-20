package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(classes = HearingInterpreterComponentScanTest.TestConfig.class)
class HearingInterpreterComponentScanTest {

    //Now uses the components from the mainclasses to autowire HearingInterceptor and LauralWordproducer
    //vs innerclass
    // vs @SpringJUnitConfig(classes = {BaseConfig.class, LaurelConfig.class})     (laural = primary)
    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.sfg")  // goes to both java and test packages
    static class TestConfig {

    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("Laurel", word);
    }
}