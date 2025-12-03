package it.prova.test;

import it.prova.utility.Lavoratore;
import it.prova.utility.Operaio;
import it.prova.utility.Volontario;

public class TestLavoratore {
    public static void main(String[] args){
        //Test per vedere il polimorfismo
        Lavoratore lavoratore1 = new Lavoratore("Mario", "Rossi");
        System.out.println(lavoratore1.getCognome() + ", stipendio: " + lavoratore1.percepisco());
        lavoratore1 = new Operaio("Gaia", "Bianchi", 30_000);
        System.out.println(lavoratore1.getNome() + ", " + lavoratore1.percepisco());
        lavoratore1 = new Volontario("Marco", "Verdi", "Unicef");
        System.out.println(lavoratore1.getNome() + ", " + lavoratore1.percepisco());

        //Test per vedere quanti lavoratori ci sono
        Lavoratore l1 = new Lavoratore("Mario", "Rossi");
        Operaio o1 = new Operaio("Gaia", "Bianchi", 30_000);
        Volontario v1 = new Volontario("Marco", "Verdi", "Unicef");
        Lavoratore[] lavoratori  = {l1, o1, v1};
        int risultato = Lavoratore.contaQuantiLavoratori(lavoratori);
        System.out.println("Quanti lavoratori ci sono? " + risultato);

        //Test per vedere quanti operai ci sono sempre con instanceof
        Lavoratore l2 = new Lavoratore("Mario", "Rossi");
        Operaio o2 = new Operaio("Gaia", "Bianchi", 30_000);
        Volontario v2 = new Volontario("Marco", "Verdi", "Unicef");
        Lavoratore[] operai  = {l2, o2, v2};
        int risultato2 = Operaio.contaQuantiOperai(operai);
        System.out.println("Quanti operai ci sono? " + risultato2);
    }
}
