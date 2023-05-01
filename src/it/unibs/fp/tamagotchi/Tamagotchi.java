package it.unibs.fp.tamagotchi;
import it.unibs.fp.mylib;
/*
 * questa classe...
 * */
public class Tamagotchi {
    public static final int FATTORE_CAREZZE = 2;  //
    public static final int FATTORE_BISCOTTI = 4; //
    public static final double FATTORE_PERCENTUALE = 0.1;  //
    
    //attributi di tamagotchi
    private String nome; 
    private double sazieta;
    private double affetto;
    //costruttore
    public Tamagotchi(String _nome, double _sazieta, double _affetto) {
        this.nome = _nome;
        this.sazieta = _sazieta;
        this.affetto = _affetto;
    }
    //getters
    public String getNome() {
        return nome;
    }

    public double getSazieta() {
        return sazieta;
    }

    public double getAffetto() {
        return affetto;
    }
    //metodi per variare i livelli di soddisfazione e sazieta in base agli stimoli esterni ricevuti 
    void riceviCarezze (int carezze) {
        affetto = Math.min(100, affetto + carezze);
        sazieta = Math.max(0, sazieta - carezze/ FATTORE_CAREZZE);
    }
    void riceviBiscotti(int biscotti) {
        for (int i=0; i < biscotti; i++) {
            sazieta= Math.min(100, sazieta + sazieta * FATTORE_PERCENTUALE); //sazieta<=100
            affetto= Math.max(0, biscotti / FATTORE_BISCOTTI); //affetto <= 0
        }
    }
   
    /*
     @TODO
     METODO sono morto(se sazieta= 0 || affetto == 0 || sazieta== sogliamax )
     METODO sono triste (se sazieta< soglia o affetto< soglia)
     METODO toString per Stampare la descrizione del tamagotchi a ogni passo
    */
    
    
}