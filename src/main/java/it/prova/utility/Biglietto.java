package it.prova.utility;

public class Biglietto {
    private String nomeSpettacolo;
    private char letteraFila;
    private int numeroPosto;
    private int prezzo;

    public Biglietto(){}

    public Biglietto(String nomeSpettacolo, char letteraFila, int numeroPosto, int prezzo){
        this.nomeSpettacolo = nomeSpettacolo;
        this.letteraFila = letteraFila;
        this.numeroPosto = numeroPosto;
        this.prezzo = prezzo;
    }

    public String getNomeSpettacolo(){
        return this.nomeSpettacolo;
    }

    public char getLetteraFila(){
        return this.letteraFila;
    }

    public int getNumeroPosto(){
        return this.numeroPosto;
    }

    public int getPrezzo(){
        return this.prezzo;
    }

    public void setNomeSpettacolo(String nomeSpettacolo){
        this.nomeSpettacolo = nomeSpettacolo;
    }

    public void setLetteraFila(char letteraFila){
        this.letteraFila = letteraFila;
    }

    public void setNumeroPosto(int numeroPosto){
        this.numeroPosto = numeroPosto;
    }

    public void setPrezzo(int prezzo){
        this.prezzo = prezzo;
    }

    public static Biglietto trovaIlPiuEconomico(Biglietto[] elencoBiglietti){
        Biglietto result = elencoBiglietti[0];
        for(int i = 1; i < elencoBiglietti.length; i++){
            if (elencoBiglietti[i].getPrezzo() < elencoBiglietti[i-1].getPrezzo()){
                result = elencoBiglietti[i];
            }
        }
        return result;
    }

    public boolean bigliettoAncoraInvenduto(Biglietto[] elencoBigliettiInvenduti){
        for(int i = 0; i < elencoBigliettiInvenduti.length; i++){
            if (elencoBigliettiInvenduti[i].equals(this)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return this.nomeSpettacolo + " " + this.getPrezzo();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Biglietto biglietto = (Biglietto) o;
        if (this.getNomeSpettacolo().equals(biglietto.getNomeSpettacolo()) && this.prezzo == biglietto.getPrezzo() && this.getLetteraFila() == biglietto.getLetteraFila() && this.numeroPosto == biglietto.getNumeroPosto()){
            return true;
        }
        return false;
    }
}
