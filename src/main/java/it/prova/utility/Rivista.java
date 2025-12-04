package it.prova.utility;

public class Rivista extends MaterialeBiblioteca{
    private int numeroEdizione;
    private int annoPubblicazione;

    public Rivista(){}

    public Rivista(String titolo, String autore, int codiceIdentificativo, boolean isDisponibile, int numeroEdizione, int annoPubblicazione) {
        super(titolo, autore, codiceIdentificativo, isDisponibile);
        this.numeroEdizione = numeroEdizione;
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroEdizione() {
        return this.numeroEdizione;
    }

    public void setNumeroEdizione(int numeroEdizione) {
        this.numeroEdizione = numeroEdizione;
    }

    public int getAnnoPubblicazione() {
        return this.annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    @Override
    public String calcolaTempoPrestitoMassimo(){
        return super.calcolaTempoPrestitoMassimo();
    }
}
