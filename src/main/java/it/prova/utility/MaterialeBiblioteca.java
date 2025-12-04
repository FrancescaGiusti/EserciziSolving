package it.prova.utility;

public class MaterialeBiblioteca {
    protected String titolo;
    protected String autore;
    protected int codiceIdentificativo;
    protected boolean isDisponibile;

    public MaterialeBiblioteca(){}

    public MaterialeBiblioteca(String titolo, String autore, int codiceIdentificativo, boolean isDisponibile){
        this.titolo = titolo;
        this.autore = autore;
        this.codiceIdentificativo = codiceIdentificativo;
        this.isDisponibile = isDisponibile;
    }

    public String getTitolo(){
        return this.titolo;
    }

    public String getAutore(){
        return this.autore;
    }

    public int getCodiceIdentificativo(){
        return this.codiceIdentificativo;
    }

    public boolean isDisponibile(){
        return this.isDisponibile;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public void setAutore(String autore){
        this.autore = autore;
    }

    public void setCodiceIdentificativo(int codiceIdentificativo){
        this.codiceIdentificativo = codiceIdentificativo;
    }

    public void setDisponibile(boolean isDisponibile){
        this.isDisponibile = isDisponibile;
    }

    public void prestito(){
        if (this.isDisponibile){
            setDisponibile(false);
            System.out.println("Ha ricevuto il prestito del libro da lei selezionato");
        } else {
            System.out.println("Il libro da lei selezionato è già stato preso in prestito");
        }
    }

    public void restituzione(){
        if (!this.isDisponibile){
            setDisponibile(true);
            System.out.println("La restituzione del libro è avvenuta correttamente");
        } else {
            System.out.println("Non posso restituire il libro in quanto non è mai stato preso in prestito");
        }
    }

    public String calcolaTempoPrestitoMassimo(){
        return "14 giorni";
    }

    @Override
    public String toString(){
        return this.titolo + ", " + this.autore + ", disponibile? " + this.isDisponibile;
    }
}
