package it.unibs.fp.tamagotchi;
import it.unibs.fp.mylib.MyMenu;
import it.unibs.fp.mylib.NumeriCasuali;
/**
 * Classe Main: contiene la logica del programma
 * @author molla blen zena
 * @author Stocchetti Daian
 * @author Fatih Aya 
 *
 */
public class Main {
    public static final String NOME_MENU = "Menu Tamagotchi";
    public static final String[] VOCI_MENU = new String[]{"Dai carezze", "Dai biscotti"};
    public static final String SALUTO = "Benvenuti a Tamagotchi\n";
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(SALUTO);

        //TODO INTERAZIONE CON UTENTE
        Tamagotchi tama = IOUtil.creaTamagotchi();
        MyMenu menu = new MyMenu(NOME_MENU, VOCI_MENU);
     // istanza della classe MyMenu di mylib
        boolean finito= false;
        do {
            int scelta = menu.scegli();

            switch(scelta) {
                case 1:
                    tama.riceviCarezze(NumeriCasuali.estraiIntero(1, 5));
                    break;
                case 2:
                    tama.riceviBiscotti(NumeriCasuali.estraiIntero(1, 5));
                case 0:
                    finito = true;  //uscita dal programma
                    break;
                default:
                    System.out.println("Seleziona un'opzione valida!");
                    
            }
            System.out.println(tama); //stampa il toString relativo all'oggetto istanziato
        } while(!finito); 
    }
    
}