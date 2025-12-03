package it.prova.utility;

public class Volontario extends Lavoratore{
    private String nomeAssociazione;

    public Volontario(){}

    public Volontario(String nome, String cognome, String nomeAssociazione){
        super(nome, cognome);
        this.nomeAssociazione = nomeAssociazione;
    }

    public String getNomeAssociazione(){
        return this.nomeAssociazione;
    }

    public void setNomeAssociazione(String nomeAssociazione){
        this.nomeAssociazione = nomeAssociazione;
    }

    @Override
    public String percepisco() {
        return this.nomeAssociazione+ "E’ NO PROFIT";
    }
}
