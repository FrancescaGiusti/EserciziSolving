package it.prova.test;

import it.prova.utility.Indirizzo;
import it.prova.utility.Persona;

public class TestPersona {
    public static void main(String[] args){
        //Test per vedere se una persona abita in una certa città
        Persona persona1 = new Persona("Francesca", "Giusti", 24);
        Indirizzo indirizzo1 = new Indirizzo("Via Caio Grande", "Roma", 24);
        persona1.setIndirizzo(indirizzo1);
        String cittaDaTestare = "Roma";
        boolean risultato1 = persona1.abitaA(cittaDaTestare);
        System.out.println(persona1.getNome() + " " + persona1.getCognome() + " vive a " + cittaDaTestare + "? " + risultato1);

        //Test per vedere se una persona ha almeno un coincittadino
        Persona persona2 = new Persona("Greta", "Rossi", 30);
        Indirizzo indirizzo2 = new Indirizzo("Via Caio Piccolo", "Creta", 24);
        persona2.setIndirizzo(indirizzo2);
        Persona persona3 = new Persona("Mario", "Bianchi", 30);
        Indirizzo indirizzo3 = new Indirizzo("Via Caio Piccolo", "Atene", 24);
        persona3.setIndirizzo(indirizzo3);
        Persona persona4 = new Persona("Gaia", "Neri", 30);
        Indirizzo indirizzo4 = new Indirizzo("Via Sempronio Piccolo", "Roma", 24);
        persona4.setIndirizzo(indirizzo4);
        Persona[] persone = {persona3, persona4};
        boolean risposta2 = persona2.haAlmenoUnConcittadino(persone);
        System.out.println(persona2.getNome() + " ha almeno un coincittadino? " + risposta2);

        //Test per vedere se sono tutti più anziani di una persona indicata
        Persona persona5 = new Persona("Greta", "Rossi", 24);
        Indirizzo indirizzo5 = new Indirizzo("Via Caio Piccolo", "Creta", 24);
        persona5.setIndirizzo(indirizzo5);
        Persona persona6 = new Persona("Mario", "Bianchi", 60);
        Indirizzo indirizzo6 = new Indirizzo("Via Caio Piccolo", "Atene", 24);
        persona6.setIndirizzo(indirizzo6);
        Persona persona7 = new Persona("Gaia", "Neri", 18);
        Indirizzo indirizzo7 = new Indirizzo("Via Sempronio Piccolo", "Roma", 24);
        persona7.setIndirizzo(indirizzo7);
        Persona[] persone2 = {persona6, persona7};
        boolean risposta3 = persona5.sonoTuttiPiuAnziani(persone2);
        System.out.println("Sono tutti più anziani di: " + persona5.getNome() + "? " + risposta3);

        //Test per vedere in quanti coabitano nello stesso palazzo di una determinata persona
        Persona persona8 = new Persona("Greta", "Rossi", 24);
        Indirizzo indirizzo8 = new Indirizzo("Via Caio Piccolo", "Creta", 24);
        persona8.setIndirizzo(indirizzo8);
        Persona persona9 = new Persona("Mario", "Bianchi", 26);
        Indirizzo indirizzo9 = new Indirizzo("Via Caio Piccolo", "Creta", 24);
        persona9.setIndirizzo(indirizzo9);
        Persona persona10 = new Persona("Gaia", "Neri", 16);
        Indirizzo indirizzo10 = new Indirizzo("Via Sempronio Piccolo", "Roma", 24);
        persona10.setIndirizzo(indirizzo10);
        Persona[] persone3 = {persona9, persona10};
        int condomini = persona8.quantiCoabitanoNelMioStessoPalazzo(persone3);
        System.out.println(condomini + " persone coabitano nello stesso palazzo di " + persona8.getNome());

        //Test per far coabiatre due persone
        Persona persona11 = new Persona("Francesca", "Giusti", 24);
        Indirizzo indirizzo11 = new Indirizzo("Via Caio Grande", "Roma", 24);
        persona11.setIndirizzo(indirizzo11);
        Persona persona12 = new Persona("Gaia", "Neri", 16);
        persona11.vieneACoabitareConTe(persona12);
        System.out.println(persona12.getIndirizzo());
    }
}
