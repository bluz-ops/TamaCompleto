package it.unibs.fp.tamagotchi;
import it.unibs.fp.mylib.InputDati;

/*
 * questa classe tutta static regola l'interazione con l'utente... 
 * */
public class IOUtil {
	public static final int MAX_SAZIETA = 100;
	public static final int MAX_AFFETTO = 100;
	public static final String MSG_SAZIETA = "Inserisci il livello iniziale di sazieta";
	public static final String MSG_AFFETTO = "Inserisci il livello iniziale di affetto";
	public static final String MSG_NOME = "Inserisci il nome del tuo tamagotchi";

	//metodo che ritorna un tamagotchi inizalizzandolo con i valori inseriti dall'utente
	/**
	 * Metodo per istanziare la classe Tamagotchi
	 * @return tama crea un istanza di Tamagotchi
	 */
    public static Tamagotchi creaTamagotchi(){
       String nome = InputDati.leggiStringaNonVuota(MSG_NOME);
       int affetto= InputDati.leggiIntero(MSG_AFFETTO, 0, MAX_AFFETTO);
       int sazieta= InputDati.leggiIntero(MSG_SAZIETA, 0, MAX_SAZIETA);
       Tamagotchi tama= new Tamagotchi(nome, affetto, sazieta);
       return tama;
    }
}
