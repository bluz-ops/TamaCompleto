package it.unibs.fp.tamagotchi;
/*
 * questa classe contiene l'oggetto tamagothi ed e' intesa da istanziare
 * */
public class Tamagotchi {
    //public static final String DESCRIZIONE = "Nickname: %s\n Sazieta:%2.1f \n Affetto:%2.1f \n";
	public static final int FATTORE_CAREZZE = 2;  //
    public static final int FATTORE_BISCOTTI = 4; //
    public static final double FATTORE_PERCENTUALE = 0.1;  //
    
    //attributi di tamagotchi
    private String nome; 
    private double sazieta;
    private double affetto;
  
    /*costruttore
     * NB: si e' scelto di inizializzare l'oggetto con interi mentre i valori */
    public Tamagotchi(String _nome, int _affetto, int _sazieta) {
        this.nome = _nome;
        this.affetto = _affetto;
        this.sazieta = _sazieta;
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
    public void riceviCarezze (int carezze) {
        affetto = Math.min(100, affetto + carezze);
        sazieta = Math.max(0, sazieta - carezze/ FATTORE_CAREZZE);
    }
    public void riceviBiscotti(int biscotti) {
        for (int i=0; i < biscotti; i++) {
            sazieta= Math.min(100, sazieta + sazieta * FATTORE_PERCENTUALE); //sazieta<=100
        }
        affetto= Math.max(0, affetto - biscotti / FATTORE_BISCOTTI); //affetto >= 0
    }
   
    /*
     @TODO
     METODO isMorto(se sazieta= 0 || affetto == 0 || sazieta== sogliamax )
     METODO isTriste (se sazieta< soglia o affetto< soglia)
     METODO toString per Stampare la descrizione del tamagotchi a ogni passo
     EVOLUZIONE
     
     METODO benessereComplessivo
    */
    
    @Override
    public String toString(){
    		StringBuffer descrizione = new StringBuffer();
    		descrizione.append("\nNickname="+ nome);
    		descrizione.append("\nSazieta=" + sazieta);
    		descrizione.append("\nSoddisfazione=" + affetto);
    		if(isTriste()) {
    			descrizione.append("\nSono Triste :< ");
    		}
    		else if(isFelice()) {
    			descrizione.append("\nSono Felice :> ");
    		}
    		else if(isMorto()) {
    			descrizione.append("\n Sono Morto !!!!");
    		}
    		else {
    			descrizione.append("\n I'm aight :| ");
    		}
    		return descrizione.toString();
    		//return String.format(DESCRIZIONE, nome, sazieta, affetto);
    	}
    
    public boolean isTriste() {
		if (getAffetto()<30 || getSazieta()<30) {
			return true;
		}
		else if ( getSazieta()>90 && getSazieta()<100){
			return true;
		}
		else {
			return false;
		}
    }
    //soglia felicita' posta a 80 (non indicata dalla consegna)
    public boolean isFelice() {
    	return (sazieta > 80 && affetto > 80);
    }
    
    public boolean isMorto() {
        return (sazieta==0 || affetto==0 || sazieta==100);
      }
 
}