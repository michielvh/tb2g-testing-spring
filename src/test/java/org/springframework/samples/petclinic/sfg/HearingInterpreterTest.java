package org.springframework.samples.petclinic.sfg;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


public class HearingInterpreterTest {
// USES BEAN HEARINGINTERPRETER FROM BASE CONFIG CLASS
    HearingInterpreter hearingInterpreter;

    // USES BEAN LAURELWORDPRODUCER FROM LAURALCONFIG.CLASS
    @Before
    public void setUp() throws Exception{
        hearingInterpreter = new HearingInterpreter(new LaurelWordProducer());
    }
    @Test
    public void whatIheard() {
        String word = hearingInterpreter.whatIheard();


        assertEquals("Laurel", word);
    }
}