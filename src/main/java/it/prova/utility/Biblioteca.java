package it.prova.utility;

public class Biblioteca {
    private MaterialeBiblioteca[] materiali;

    public Biblioteca(){}

    public Biblioteca(MaterialeBiblioteca[] materiali){
        this.materiali = materiali;
    }

    public MaterialeBiblioteca[] getMateriali() {
        return this.materiali;
    }

    public void setMateriali(MaterialeBiblioteca[] materiali) {
        this.materiali = materiali;
    }

    public void aggiungiMateriale(MaterialeBiblioteca m){
        MaterialeBiblioteca[] newMateriali = new MaterialeBiblioteca[this.materiali.length + 1];
        for (int i = 0; i < newMateriali.length - 1; i++){
            newMateriali[i] = materiali[i];
        }
        newMateriali[newMateriali.length - 1] = m;
        setMateriali(newMateriali);
    }

    public String cercaMaterialePerTitolo(String titolo){
        String result = "";
        for (int i = 0; i < this.materiali.length; i ++){
            if (materiali[i].getTitolo().equalsIgnoreCase(titolo)){
                result += materiali[i].toString() + "\n";
            }
        }
        return result;
    }

    public String elencaMaterialiDisponibili(){
        String result = "";
        for (int i = 0; i < this.materiali.length; i++){
            if (materiali[i].isDisponibile()){
                result += materiali[i].toString() + "\n";
            }
        }
        return result;
    }

    public String elencaMaterialiInPrestito(){
        String result = "";
        for (int i = 0; i < this.materiali.length; i++){
            if (!materiali[i].isDisponibile()){
                result += materiali[i].toString() + "\n";
            }
        }
        return result;
    }
}
