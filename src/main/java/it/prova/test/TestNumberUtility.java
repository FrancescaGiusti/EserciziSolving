package it.prova.test;

import it.prova.utility.NumberUtility;

public class TestNumberUtility {
    public static void main(String[] args){
        //Test per vedere se l'array fornito è costituito interamente da numeri pari
        int[] numeri = {2, 4, 6, 8, 8};
        boolean isArrayCostituitoDaNumeriPari = NumberUtility.isArrayDiNumeriPari(numeri);
        System.out.println("L'array fornito è costituito da solo numeri pari? " + isArrayCostituitoDaNumeriPari);

        //Test per vedere se nell'array esiste almeno un numero negativo e pari
        int[] numeri2 = {1, 4, 6, -4, 5};
        boolean isPresenteUnNumeroNegativoEPari = NumberUtility.esisteAlmenoUnNegativoPari(numeri2);
        System.out.println("Esiste almeno un numero negativo e pari nell'array? " + isPresenteUnNumeroNegativoEPari);

        //Test che effettua la somma di elementi in posizione dispari scorrendo l'array al contrario
        int[] numeri3 = {1, 4, 6, -3, 5};
        int sommaElementiInPosizioneDispari = NumberUtility.sommaElementiInPosizioneDispari(numeri3);
        System.out.println("La somma degli elementi in posizione dispari è: " + sommaElementiInPosizioneDispari);

    }


}
