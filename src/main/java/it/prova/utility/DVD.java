package it.prova.utility;

public class DVD extends MaterialeBiblioteca{
    private int durata;

    public DVD(){}

    public DVD(String titolo, String autore, int codiceIdentificativo, boolean isDisponibile, int durata) {
        super(titolo, autore, codiceIdentificativo, isDisponibile);
        this.durata = durata;
    }

    public int getDurata() {
        return this.durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String calcolaTempoPrestitoMassimo(){
        return "7 giorni";
    }
}
