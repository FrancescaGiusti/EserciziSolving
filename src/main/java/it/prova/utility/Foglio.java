package it.prova.utility;

public class Foglio {
    private String qualita;
    private String tipologia;

    public Foglio(){}

    public Foglio(String qualita, String tipologia){
        this.qualita = qualita;
        this.tipologia = tipologia;
    }

    public String getQualita(){
        return this.qualita;
    }

    public String getTipologia(){
        return this.tipologia;
    }

    public void setQualita(String qualita){
        this.qualita = qualita;
    }

    public void setTipologia(String tipologia){
        this.tipologia = tipologia;
    }

    @Override
    public String toString(){
        return this.qualita + " " + this.tipologia;
    }
}
