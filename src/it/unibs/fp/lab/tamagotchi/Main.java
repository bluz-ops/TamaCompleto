package it.unibs.fp.lab.tamagotchi;

import it.unibs.fp.mylib.MyMenu;
import it.unibs.fp.mylib.NumeriCasuali;

public class Main {
    public static final String NOME_MENU = "Menu Tamagotchi";
    public static final String[] VOCI_MENU = new String[]{"Dai carezze", "Dai biscotti"};
    public static final String SALUTO = "Buongiorno!";

    public static void main(String[] args) {
        System.out.println(SALUTO);

        //TODO INTERAZIONE CON UTENTE
        Tamagotchi tama = IOUtil.creaTamagotchi();

        MyMenu menu = new MyMenu(NOME_MENU, VOCI_MENU);
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
                    finito = true;
                    break;
                default:
                    System.out.println("Seleziona un'opzione valida!");
            }
        } while(!finito);
        System.out.println("Arrivederci!");
    }




}