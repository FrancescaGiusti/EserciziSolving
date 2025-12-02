package it.prova.utility;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private Indirizzo indirizzo;

    public Persona (String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public int getEta(){
        return this.eta;
    }

    public void setIndirizzo(Indirizzo indirizzo){
        this.indirizzo = indirizzo;
    }

    public Indirizzo getIndirizzo(){
        return this.indirizzo;
    }

    @Override
    public String toString(){
        return this.nome + " " + this.cognome + ", " + this.eta + " anni" + this.indirizzo;
    }

    public boolean abitaA(String cittaInput) {
        return this.indirizzo.getCitta().equals(cittaInput);
    }
    public boolean haAlmenoUnConcittadino(Persona[] elenco) {
        for(int i  = 0; i < elenco.length; i++){
            if (this.indirizzo.getCitta().equals(elenco[i].indirizzo.getCitta())){
                return true;
            }
        }
        return false;
    }

    public boolean sonoTuttiPiuAnziani(Persona[] elenco){
        for (int i = 0; i < elenco.length; i++){
            if (elenco[i].getEta() < this.getEta()){
                return false;
            }
        }
        return true;
    }

    public int quantiCoabitanoNelMioStessoPalazzo(Persona[] elencoInput){
        int condomini = 0;
        for(int i = 0; i < elencoInput.length; i++){
            if (this.indirizzo.toString().equals(elencoInput[i].indirizzo.toString())){
                condomini ++;
            }
        }
        return condomini;
    }

    public void vieneACoabitareConTe(Persona nuovoCoinquilino){
        nuovoCoinquilino.indirizzo = new Indirizzo();
        nuovoCoinquilino.indirizzo.setCitta(this.indirizzo.getCitta());
        nuovoCoinquilino.indirizzo.setCivico(this.indirizzo.getCivico());
        nuovoCoinquilino.indirizzo.setVia(this.indirizzo.getVia());
    }
}
