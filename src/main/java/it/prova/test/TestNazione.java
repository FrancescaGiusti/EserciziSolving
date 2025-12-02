package it.prova.test;

import it.prova.utility.Nazione;

public class TestNazione {
    public static void main(String[] args){
        //Test per vedere se una nazione è più estesa di un'altra
        Nazione nazione1 = new Nazione("Italia", 302.073, 59_000_000);
        Nazione nazione2 = new Nazione("Spagna", 505.998, 48_196_693);
        boolean confronto1 = nazione1.piuEstesaDi(nazione2);
        System.out.println(nazione1.getDenominazione() + " è più estesa di " + nazione2.getDenominazione() + "? " + confronto1);

        //Test per vedere se una nazione è più popolosa di un'altra
        Nazione nazione3 = new Nazione("Francia", 543.965, 68_600_000);
        Nazione nazione4 = new Nazione("Germania", 357.580, 83_400_693);
        boolean confronto2 = nazione3.piuPopolosaDi(nazione4);
        System.out.println(nazione3.getDenominazione() + " è più popolosa di " + nazione4.getDenominazione() + "? " + confronto2);

        //Test per vedere se esiste almeno una nazione più estesa di quella indicata
        Nazione[] nazioni1 = {new Nazione("Italia", 302.073, 59_000_000),
                new Nazione("Spagna", 505.998, 48_196_693),
                new Nazione("Francia", 543.965, 68_600_000),
                new Nazione("Germania", 357.580, 83_400_693)
        };
        Nazione nazione5 = new Nazione("Slovenia", 20.273, 2_123_949);
        boolean confronto3 = nazione5.esisteAlmenoUnaPiuEstesa(nazioni1);
        System.out.println("Esiste almeno una nazione più estesa di " + nazione5.getDenominazione() + "? " + confronto3);

        //Test per vedere quante sono le nazioni più popolose di quella indicata
        Nazione[] nazioni2 = {new Nazione("Italia", 302.073, 59_000_000),
                new Nazione("Spagna", 505.998, 48_196_693),
                new Nazione("Francia", 543.965, 68_600_000)
        };
        Nazione nazione6 = new Nazione("Germania", 357.580, 83_400_693);
        int nazioniPiuPopolose = nazione6.dimmiQuanteSonoPiuPopolose(nazioni2);
        System.out.println("Quante sono le nazioni più popolose di " + nazione6.getDenominazione() + "? " + nazioniPiuPopolose);

        //Test per vedere se una nazione ha più abitanti di tutte le altre
        Nazione[] nazioni3 = {new Nazione("Italia", 302.073, 59_000_000),
                new Nazione("Spagna", 505.998, 48_196_693),
                new Nazione("Francia", 543.965, 68_600_000),
                new Nazione("Germania", 357.580, 83_400_693)
        };
        Nazione nazione7 = new Nazione("Francia", 543.965, 68_600_000);
        boolean confronto4 = nazione7.haPiuAbitantiDiTutteLeAltre(nazioni3);
        System.out.println(nazione7.getDenominazione() + " ha più abitanti di tutte le altre nazioni? " + confronto4);

        //Test per vedere se altre nazioni hanno tutte la stessa iniziale di una indicata
        Nazione[] nazioni4 = {new Nazione("Francia", 543.965, 68_600_000)};
        Nazione nazione8 = new Nazione("Francia", 543.965, 68_600_000);
        boolean confronto5 = nazione8.hannoTutteLaMiaStessaIniziale(nazioni4);
        System.out.println("Le altre nazioni fornite, hanno tutte la stessa iniziale di " + nazione8.getDenominazione() + "? " + confronto5);

        //Test per vedere se una nazione ha una superficie superiore rispetto alla superficie media delle altre nazioni
        Nazione[] nazioni5 = {new Nazione("Italia", 302.073, 59_000_000),
                new Nazione("Spagna", 505.998, 48_196_693),
                new Nazione("Francia", 543.965, 68_600_000),
                new Nazione("Germania", 357.580, 83_400_693)
        };
        Nazione nazione9 = new Nazione("Francia", 543.965, 68_600_000);
        boolean confronto6 = nazione9.eAlDiSopraDellaMediaComeSuperficie(nazioni5);
        System.out.println(nazione9.getDenominazione() + " ha una superficie superiore rispetto alla media della superficie delle altre nazioni? " + confronto6);






    }
}
