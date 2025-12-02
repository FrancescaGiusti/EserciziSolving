package it.prova.test;

import it.prova.utility.Biglietto;
import it.prova.utility.Spettatore;

public class TestSpettatore {
    public static void main(String[] args){
        //Test per vedere l'incasso dei paganti nella mia fila
        Biglietto biglietto1 = new Biglietto("Cenerentola", 'f', 45, 20);
        Spettatore spettatore1 = new Spettatore("Francesca", "Giusti", 54628264, biglietto1);
        Biglietto biglietto2 = new Biglietto("Cenerentola", 'f', 50, 20);
        Spettatore spettatore2 = new Spettatore("Francesca", "Neri", 54628264, biglietto2);
        Biglietto biglietto3 = new Biglietto("Cenerentola", 'g', 45, 20);
        Spettatore spettatore3 = new Spettatore("Chiara", "Giusti", 54628264, biglietto3);
        Spettatore[] spettatori1 = {spettatore2, spettatore3};
        int result=spettatore1.incassoDeiPagantiNellaMiaFila(spettatori1);
        System.out.println("L'incasso dei paganti nella stessa fila è: " + result);

        //Test per vedere il numero degli spettatori nel mio stesso spettacolo
        Biglietto biglietto4 = new Biglietto("Cenerentola", 'f', 45, 20);
        Spettatore spettatore4 = new Spettatore("Francesca", "Giusti", 54628264, biglietto4);
        Biglietto biglietto5 = new Biglietto("Cenerentola", 'f', 50, 20);
        Spettatore spettatore5 = new Spettatore("Francesca", "Neri", 54628264, biglietto5);
        Biglietto biglietto6 = new Biglietto("Cenerentola", 'g', 45, 20);
        Spettatore spettatore6 = new Spettatore("Chiara", "Giusti", 54628264, biglietto6);
        Spettatore[] spettatori2 = {spettatore5, spettatore6};
        int result2 = spettatore4.numeroSpettatoriDelMioStessoSpettacolo(spettatori2);
        System.out.println("Il numero di spettatori del mio stesso spettacolo è: " + result2);

        //Test per vedere se il numero degli aspettatori del mio spettacolo supera le aspettative
        Biglietto biglietto7 = new Biglietto("Cenerentola", 'f', 45, 20);
        Spettatore spettatore7 = new Spettatore("Francesca", "Giusti", 54628264, biglietto7);
        Biglietto biglietto8 = new Biglietto("Cenerentola", 'f', 50, 20);
        Spettatore spettatore8 = new Spettatore("Francesca", "Neri", 54628264, biglietto8);
        Biglietto biglietto9 = new Biglietto("Cenerentola", 'g', 45, 20);
        Spettatore spettatore9 = new Spettatore("Chiara", "Giusti", 54628264, biglietto9);
        Spettatore[] spettatori3 = {spettatore7, spettatore8, spettatore9};
        boolean result3 = spettatore1.numeroSpettatoriMioSpettacoloSuperaAspettativa(spettatori3, 2);
        System.out.println("Il numero degli spettatori al mio spettacolo supera le mie aspettative? " + result3);

        //Test per trovare il biglietto più economico
        Biglietto biglietto10 = new Biglietto("MarioKart", 'f', 45, 40);
        Biglietto biglietto11 = new Biglietto("Cenerentola", 'f', 50, 20);
        Biglietto biglietto12 = new Biglietto("Avatar", 'g', 45, 50);
        Biglietto[] biglietti = {biglietto10, biglietto11, biglietto12};
        Biglietto result5 = Biglietto.trovaIlPiuEconomico(biglietti);
        System.out.println("Il biglietto più economico è: " + result5);

        //Test per vedere se c'è qualche biglietto ancora invenduto
        Biglietto biglietto13 = new Biglietto("MarioKart", 'f', 45, 40);
        Biglietto biglietto14 = new Biglietto("Cenerentola", 'f', 50, 20);
        Biglietto biglietto15 = new Biglietto("Avatar", 'g', 45, 50);
        Biglietto[] biglietti2 = { biglietto14, biglietto15};
        boolean result8 = biglietto13.bigliettoAncoraInvenduto(biglietti2);
        System.out.println("Il biglietto preso in analisi è ancora invenduto? " + result8);


    }
}
