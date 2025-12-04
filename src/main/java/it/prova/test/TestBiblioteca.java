package it.prova.test;

import it.prova.utility.*;

public class TestBiblioteca {
    public static void main(String[] args){
        //Test per eseguire un prestito in biblioteca
        MaterialeBiblioteca materiale = new MaterialeBiblioteca("Cime Tempestose", "Emily Brontë", 978880991, true);
        materiale.prestito();

        //Test per eseguire una restituzione in biblioteca
        MaterialeBiblioteca materiale2 = new MaterialeBiblioteca("Pura Vida", "Gianluca Gotto", 1235642327, false);
        materiale2.restituzione();

        //Test per calcolare il tempo massimo di un prestito in biblioteca
        MaterialeBiblioteca materiale3 = new MaterialeBiblioteca("Dorian Gray", "Oscar Wilde", 978880922, true);
        String result = materiale3.calcolaTempoPrestitoMassimo();
        System.out.println("Tempo massimo di prestito: " + result);

        //Test per calcolare il tempo massimo di un prestito di un libro in biblioteca
        Libro libro1 = new Libro("Cime Tempestose", "Emily Brontë", 978880991, true, 400, "Romanzo");
        String result2 = libro1.calcolaTempoPrestitoMassimo();
        System.out.println("Tempo massimo di prestito: " + result2);

        //Test per calcolare il tempo massimo di un prestito di una rivista in biblioteca
        Rivista rivista1 = new Rivista("Rivista di Economia e Tecnologia", "Mario Rossi", 12345, true, 3, 2024);
        String result3 = rivista1.calcolaTempoPrestitoMassimo();
        System.out.println("Tempo massimo di prestito: " + result3);

        //Test per calcolare il tempo massimo di un prestito di un DVD in biblioteca
        DVD dvd1 = new DVD("Inception", "Christopher Nolan", 135264, false, 148);
        String result4 = dvd1.calcolaTempoPrestitoMassimo();
        System.out.println("Tempo massimo di prestito: " + result4);

        //Test per aggiungere un materiale in biblioteca
        MaterialeBiblioteca[] materialeBiblioteca = {new MaterialeBiblioteca("Cime Tempestose", "Emily Brontë", 978880991, true),
                new MaterialeBiblioteca("Pura Vida", "Gianluca Gotto", 1235642327, false),
                new MaterialeBiblioteca("Dorian Gray", "Oscar Wilde", 978880922, true),
                new Libro("Cime Tempestose", "Emily Brontë", 978880991, true, 400, "Romanzo"),
                new Rivista("Rivista di Economia e Tecnologia", "Mario Rossi", 12345, true, 3, 2024)};
        Biblioteca biblioteca = new Biblioteca(materialeBiblioteca);
        System.out.println(biblioteca.getMateriali().length);
        biblioteca.aggiungiMateriale(new DVD("Inception", "Christopher Nolan", 135264, false, 148));
        System.out.println(biblioteca.getMateriali().length);

        //Test per cercare un materiale per titolo in biblioteca
        MaterialeBiblioteca[] materialeBiblioteca2 = {new MaterialeBiblioteca("Cime Tempestose", "Emily Brontë", 978880991, true),
                new MaterialeBiblioteca("Pura Vida", "Gianluca Gotto", 1235642327, false),
                new MaterialeBiblioteca("Dorian Gray", "Oscar Wilde", 978880922, true),
                new Libro("Cime Tempestose", "Emily Brontë", 978880991, true, 400, "Romanzo"),new DVD("Inception", "Christopher Nolan", 135264, false, 148),
                new Rivista("Rivista di Economia e Tecnologia", "Mario Rossi", 12345, true, 3, 2024)};
        Biblioteca biblioteca2 = new Biblioteca(materialeBiblioteca2);
        String result6 = biblioteca2.cercaMaterialePerTitolo("pura vida");
        System.out.println(result6);

        //Test che elenca i materiali disponibili in biblioteca
        MaterialeBiblioteca[] materialeBiblioteca3 = {new MaterialeBiblioteca("Cime Tempestose", "Emily Brontë", 978880991, true),
                new MaterialeBiblioteca("Pura Vida", "Gianluca Gotto", 1235642327, false),
                new MaterialeBiblioteca("Dorian Gray", "Oscar Wilde", 978880922, true),
                new Libro("Cime Tempestose", "Emily Brontë", 978880991, true, 400, "Romanzo"),new DVD("Inception", "Christopher Nolan", 135264, false, 148),
                new Rivista("Rivista di Economia e Tecnologia", "Mario Rossi", 12345, true, 3, 2024)};
        Biblioteca biblioteca3 = new Biblioteca(materialeBiblioteca3);
        String result7 = biblioteca3.elencaMaterialiDisponibili();
        System.out.println(result7);

        //Test che elenca i materiali in prestito in biblioteca
        MaterialeBiblioteca[] materialeBiblioteca4 = {new MaterialeBiblioteca("Cime Tempestose", "Emily Brontë", 978880991, true),
                new MaterialeBiblioteca("Pura Vida", "Gianluca Gotto", 1235642327, false),
                new MaterialeBiblioteca("Dorian Gray", "Oscar Wilde", 978880922, true),
                new Libro("Cime Tempestose", "Emily Brontë", 978880991, true, 400, "Romanzo"),new DVD("Inception", "Christopher Nolan", 135264, false, 148),
                new Rivista("Rivista di Economia e Tecnologia", "Mario Rossi", 12345, true, 3, 2024)};
        Biblioteca biblioteca4 = new Biblioteca(materialeBiblioteca4);
        String result8 = biblioteca4.elencaMaterialiInPrestito();
        System.out.println(result8);
    }
}
