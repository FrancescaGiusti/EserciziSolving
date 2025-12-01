package it.prova.test;

import it.prova.utility.MyArrayUtility;

public class TestMyArrayUtility {
    public static void main(String[] args){
        //Test per calcolare il prodotto dei numeri in posizione dispari di un array
        int[] numeriInput = {1, 2, 3, 4, 5, 6, 7};
        int prodottoNumInPosizioneDispari = MyArrayUtility.calcolaProdottoNumeriInPosizioneDispari(numeriInput);
        System.out.println("Il prodotto dei numeri in posizione dispari è: " + prodottoNumInPosizioneDispari);

        //Test per vedere qual è la parola più lunga in un array di parole
        String[] paroleInput = {"Ciao", "io", "sono", "Francesca"};
        String parolaPiuLunga = MyArrayUtility.parolaPiuLunga(paroleInput);
        System.out.println("La parola più lunga presente nell'array è: " + parolaPiuLunga);

        //Test per vedere se in un array di nomi, un nome è presente almeno una volta
        String[] nomi = {"Francesca", "Lucia", "Luca", "Francesco", "Marco"};
        String nomeDaVerificare = "Marco";
        boolean isNomePresente = MyArrayUtility.isNomePresente(nomeDaVerificare, nomi);
        System.out.println("E' presente il nome " + nomeDaVerificare + "? " + isNomePresente);

        //Test per vedere quante volte è presente un nome in un array
        String[] nomiDiversi = {"Francesca", "Lucia", "Luca", "Francesco", "Lucia"};
        String nomeDaTrovare = "Lucia";
        int numeroDiVolteInCuiEPresenteIlNome = MyArrayUtility.quanteVolteEPresente(nomiDiversi, "Lucia");
        System.out.println("Quante volte è presente il nome " + nomeDaTrovare + "? " + numeroDiVolteInCuiEPresenteIlNome + " volte");


        //Test per vedere se la somma totale degli elementi in un array è zero
        int[] numeri = {1, 2, 3, 4, 5, 6, 7};
        boolean isSommaElementiUgualeAZero = MyArrayUtility.verificaSeSommaTotaleElementiEZero(numeri);
        System.out.println("La somma totale degli elementi nell'array è zero? " + isSommaElementiUgualeAZero);

        //Test per vedere, dato un array di parole, quante di queste parole hanno una lunghezza dispari
        String[] parole = {"Ciao", "Cane", "Arcobaleno", "mio"};
        int paroleConLunghezzaDispari = MyArrayUtility.paroleConLunghezzaDispari(parole);
        System.out.println("Quante parole hanno una lunghezza dispari? " + paroleConLunghezzaDispari + " parole");

        //Test per vedere quanti numeri dispari sono pesenti nell'array
        int[] numeri2 = {1, 2, 3, 4, 5, 6, 7};
        int numeriDispariPresenti = MyArrayUtility.numeriDispariPresenti(numeri2);
        System.out.println("Nell'array sono presenti " + numeriDispariPresenti + " numeri dispari");

        //Test per calcolare la somma dei numeri dispari presenti nell'array
        int[] numeri3 = {1, 2, 3, 4, 5, 6, 7};
        int sommaNumeriDispariPresenti = MyArrayUtility.sommaNumeriDispari(numeri3);
        System.out.println("La somma dei numeri dispari presenti nell'array è: " + sommaNumeriDispariPresenti);

        //Test per calcolare la somma dei numeri che si trovano in posizione pari
        int[] numeri4 = {3, 6, 4, 3};
        int sommaNumeriInPosizionePari = MyArrayUtility.sommaNumeriInPosizionePari(numeri4);
        System.out.println("La somma sei numeri in posizione pari è: " + sommaNumeriInPosizionePari);

        //Test per vedere se è presente almeno un numero negativo nell'array
        int[] numeri5 = {3, 6, -4, 3};
        boolean isNumeroNegativoPresente = MyArrayUtility.isNumeroNegativoPresente(numeri5);
        System.out.println("E' presente almeno un numero negativo? " + isNumeroNegativoPresente);

        //Test per invertire una stringa
        String parola = "Francesca";
        String parolaInvertita = MyArrayUtility.inverti(parola);
        System.out.println("La parola " + parola + " invertita è: " + parolaInvertita);

        //Test per vedere se le parole di un array sono tutte di uguale lunghezza
        String[] parole2 = {"Ciao", "Cane", "Arcobaleno", "mio"};
        boolean isParoleDiUgualeLunghezza = MyArrayUtility.sonoTuttiDiUgualeLunghezza(parole2);
        System.out.println("Le parole presenti nell'array sono tutte di uguale lunghezza? " + isParoleDiUgualeLunghezza);

        //Test per vedere se le parole terminano tutte con un carattere indicato
        String[] parole3 = {"Ciao", "Gatto", "Arcobaleno", "mio"};
        char carattereFinale = 'o';
        boolean terminanoTutteConLoStessoCarattere = MyArrayUtility.terminanoTuttiConIlCarattere(parole3, carattereFinale);
        System.out.println("Le parole dell'array finiscono tutte con il carattere " + carattereFinale + "? " + terminanoTutteConLoStessoCarattere);

        //Test per calcolare la somma della lunghezza dei nomi
        String[] nomi2 = {"Francesca", "Lucia", "Luca", "Francesco"};
        int sommaLunghezzaNomi = MyArrayUtility.sommaLunghezzaNomi(nomi2);
        System.out.println("La somma della lunghezza dei nomi presenti è: " + sommaLunghezzaNomi);




    }
}
