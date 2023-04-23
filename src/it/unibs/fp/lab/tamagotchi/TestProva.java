package it.unibs.fp.lab.tamagotchi;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestProva {
    @Test
    public void testCostruttoreNotNull() {
        Tamagotchi t = new Tamagotchi ("Nome", 10, 10);
        assertNotNull(t);
    }
    @Test
    public void testSoddisfazione (){
        Tamagotchi t = new Tamagotchi ("Nome", 10, 10);
        t.riceviCarezze(1);
        assertTrue(Math.abs(t.getAffetto()-11)<0.00001);
    }
    /*
    * istanziare tamagotchi morto
    * istanziare tamagotchi triste
    * istanziare tamagotchi vivo (felice)
    * Test: dare carezze e verifico valore
    * dare carezze e far diventare triste il tamagotchi
    * dare carezze e far morire il tamagotchi
    * idem per dare biscootti
    *
    * */
}