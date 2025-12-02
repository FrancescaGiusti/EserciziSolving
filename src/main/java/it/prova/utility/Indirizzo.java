package it.prova.utility;

public class Indirizzo {
    private String via;
    private String citta;
    private int civico;

    public Indirizzo(){}

    public Indirizzo(String via, String citta, int civico){
        this.via = via;
        this.citta = citta;
        this.civico = civico;
    }

    public String getVia(){
        return this.via;
    }

    public String getCitta(){
        return this.citta;
    }

    public int getCivico(){
        return this.civico;
    }

    public void setVia(String via){
        this.via = via;
    }

    public void setCitta(String citta){
        this.citta = citta;
    }

    public void setCivico(int civico){
        this.civico = civico;
    }

    @Override
    public String toString(){
        return this.via + " n. " + this.civico + ", città: " + this.citta;
    }
}
