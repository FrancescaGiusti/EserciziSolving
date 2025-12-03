package it.prova.test;

import it.prova.utility.Foglio;
import it.prova.utility.Raccoglitore;

public class TestRaccoglitore {
    public static void main(String[] args){
        //Test per vedere il raccoglitore e i suoi fogli
        Foglio foglio1 = new Foglio("Alta", "quadretti");
        Foglio foglio2 = new Foglio("Alta", "quadretti");
        Foglio foglio3 = new Foglio("Alta", "quadretti");
        Foglio foglio4 = new Foglio("Alta", "quadretti");
        Foglio foglio5 = new Foglio("Alta", "quadretti");
        Foglio foglio6 = new Foglio("Alta", "quadretti");
        Foglio foglio7 = new Foglio("Alta", "quadretti");
        Foglio[] fogli = {foglio1, foglio2, foglio3, foglio4, foglio5, foglio6, foglio7};
        Raccoglitore raccoglitore = new Raccoglitore("Rosso", "15cm", fogli);
        System.out.println("Ecco il raccoglitore: " + raccoglitore);

        //Test per andare ad aggiungere e rimuovere fogli
        Foglio foglio8 = new Foglio("Alta", "quadretti");
        Foglio foglio9 = new Foglio("Alta", "quadretti");
        Foglio foglio10 = new Foglio("Alta", "quadretti");
        Foglio foglio11 = new Foglio("Alta", "quadretti");
        Foglio foglio12 = new Foglio("Alta", "quadretti");
        Foglio foglio13 = new Foglio("Alta", "quadretti");
        Foglio foglio14 = new Foglio("Alta", "quadretti");
        Foglio foglio15 = new Foglio("Alta", "quadretti");
        Foglio[] fogli2 = {foglio8, foglio9, foglio10, foglio11, foglio12, foglio13, foglio14};
        Raccoglitore raccoglitore2 = new Raccoglitore("Blu", "40cm", fogli2);
        System.out.println("Raccoglitore prima dell'aggiunta del foglio: " + raccoglitore2);
        raccoglitore2.addToFogli(foglio15);
        System.out.println("Raccoglitore dopo l'aggiunta del foglio: " + raccoglitore2);
        raccoglitore2.removeFromFogli(5);
        System.out.println("Raccoglitore dopo la rimozione del foglio: " + raccoglitore2);
    }
}
