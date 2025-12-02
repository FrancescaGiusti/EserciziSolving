package it.prova.test;

import it.prova.utility.Televisore;

public class TestTelevisore {
    public static void main(String[] args){
        //Test per vedere se il televisore costa di meno del budget disponibile
        Televisore televisore1 = new Televisore("Samsung", "TV QLED", 349, 43);
        int budget = 400;
        boolean esito = televisore1.costaMenoDelBudgetDisponibile(budget);
        System.out.println("Il televisore costa di meno del budget disponibile? " + esito);

        //Test per vedere se il televisore è della stessa marca di un altro televisore indicato
        Televisore televisore2 = new Televisore("Philips", "QLED 55PUS8400", 669, 55);
        Televisore televisore3 = new Televisore("LG", "43QNED77", 329.90, 43);
        boolean isStessaMarca = televisore2.stessaMarcaDi(televisore3);
        System.out.println("Il televisore con modello " + televisore2.getMarca() + " è della stessa marca del televisore con modello " + televisore3.getMarca() + "? " + isStessaMarca);

        //Test per vedere in un array di numeri quanti sono gli elementi strettamente minori di due elementi indicati
        int[] elementi = {30, 60, 5, 4, 9};
        int soglia = 50;
        int numeriMinoriDiSoglia = Televisore.dimmiQuantiElementiStrettamenteMinoriDi(elementi, soglia);
        System.out.println("Quanti elementi minori di " + soglia + " sono presenti nell'array? " + numeriMinoriDiSoglia + " elementi");

        //Test per vedere se tutti gli elementi di un array sono compresi in un intervallo indicato
        int[] elementi2 = {30, 60, 5, 4, 9};
        int sogliaMin = 7;
        int sogliaMax = 100;
        boolean tuttiGliElementiSonoPresentiInIntervallo = Televisore.sonoTuttiDentroUnIntervallo(elementi2, sogliaMin, sogliaMax);
        System.out.println("Tutti gli elementi dell'array sono presenti nell'intervallo indicato? " + tuttiGliElementiSonoPresentiInIntervallo);

        //Test per vedere se nelle prime n posizioni di un array, tutti i nomi sono uguali
        String[] elenco = {"Claudia", "Claudia", "Chiara", "Lucia"};
        int nPosizioni = 2;
        boolean isNomiUguali = Televisore.nomiUgualiNellePrimeNPosizioni(elenco, nPosizioni);
        System.out.println("I primi " + nPosizioni + " nomi presenti nell'array sono uguali? " + isNomiUguali);

        //Test per verificare se un nome è presente solo una volta
        String[] nomi = {"Francesca", "Chiara", "Chiara", "Sofia"};
        String nome = "Chiara";
        boolean isNomePresenteUnaVolta = Televisore.ePresenteSoloUnaVolta(nomi, nome);
        System.out.println("Il nome " + nome + " è presente solo una volta nell'array? " + isNomePresenteUnaVolta);
    }
}
