package it.unibs.fp.lab.tamagotchi;

public class Tamagotchi {
    public static final int FATTORE_CAREZZE = 2;
    public static final int FATTORE_BISCOTTI = 4;
    public static final double FATTORE_PERCENTUALE = 0.1;
    private String nome;
    private double sazieta;
    private double affetto;

    public Tamagotchi(String _nome, double _sazieta, double _affetto) {
        this.nome = _nome;
        this.sazieta = _sazieta;
        this.affetto = _affetto;
    }

    public String getNome() {
        return nome;
    }

    public double getSazieta() {
        return sazieta;
    }

    public double getAffetto() {
        return affetto;
    }

    void riceviCarezze (int carezze) {
        affetto += carezze;
        sazieta-= (carezze/ FATTORE_CAREZZE);
        if (sazieta<0) {
            sazieta = 0;
        }
    }
    void riceviBiscotti(int biscotti) {
        for (int i=0; i < biscotti; i++) {
            sazieta= sazieta + sazieta * FATTORE_PERCENTUALE;
            affetto= Math.max(0, biscotti / FATTORE_BISCOTTI); //affetto non puo' essere inferiore a 0
        }
    }
    public boolean sonoMorto(){
    	
        return if sazieta==100;
    }
    public boolean sonoTriste() {
        return false;
    }
    /*
     @TODO
     METODO sono morto(se sazieta= 0 || affetto == 0 || sazieta== sogliamax )
     METODO sono triste (se sazieta< soglia o affetto< soglia)
     METODO toString per Stampare attributi tamagotchi
    */
}