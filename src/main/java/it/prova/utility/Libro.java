package it.prova.utility;

public class Libro extends MaterialeBiblioteca{
    private int numeroPagine;
    private String genere;

    public Libro(){}

    public Libro(String titolo, String autore, int codiceIdentificativo, boolean isDisponibile, int numeroPagine, String genere) {
        super(titolo, autore, codiceIdentificativo, isDisponibile);
        this.numeroPagine = numeroPagine;
        this.genere = genere;
    }

    public int getNumeroPagine(){
        return this.numeroPagine;
    }

    public String getGenere(){
        return this.genere;
    }

    public void setNumeroPagine(int numeroPagine){
        this.numeroPagine = numeroPagine;
    }

    public void setGenere(String genere){
        this.genere = genere;
    }

    @Override
    public String calcolaTempoPrestitoMassimo(){
        if (this.genere.equalsIgnoreCase("horror")){
            return "35 giorni";
        } else if (this.genere.equalsIgnoreCase("giallo")){
            return "40 giorni";
        }
        return "30 giorni";
    }
}
