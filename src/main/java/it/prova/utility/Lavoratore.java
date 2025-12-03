package it.prova.utility;

public class Lavoratore {
    protected String nome;
    protected String cognome;

    public Lavoratore(){}

    public Lavoratore(String nome, String cognome){
    this.nome = nome;
    this.cognome = cognome;
    }

    public String getNome(){
    return this.nome;
    }

    public String getCognome(){
    return this.cognome;
    }

    public void setNome(String nome){
    this.nome = nome;
    }

    public void setCognome(String cognome){
    this.cognome = cognome;
    }

    public String percepisco(){
        return "N.D.";
    }

    public static int contaQuantiLavoratori(Lavoratore []input){
        int result = 0;
        for(int i = 0; i < input.length; i ++){
            if (input[i] instanceof Lavoratore){
                result++;
            }
        }
        return result;
    }
}
