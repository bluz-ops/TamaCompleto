package it.unibs.fp.tamagotchi;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * 
 * class for junit testing
 *
 */
public class TestProva {
    public static final double FATTORE_IMPRECISIONE_DOUBLE = 0.00001;
	@Test
    //questo test viene passato con successo se l'istanza t di Tamagotchi non e' nulla
    public void testCostruttoreNotNull() {
        Tamagotchi t = new Tamagotchi ("Nome", 10, 10);
        assertNotNull(t);
    }
    @Test
    //questo test viene passato con successo se affetto e' stato effettivamente aumentato di 1
    public void testSoddisfazione (){
        Tamagotchi t = new Tamagotchi ("Nome", 10, 10);
        t.riceviCarezze(1);
        assertTrue(Math.abs(t.getAffetto()-11)<FATTORE_IMPRECISIONE_DOUBLE);
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