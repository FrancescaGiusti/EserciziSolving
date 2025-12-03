package it.prova.utility;

public class Raccoglitore {
    private String colore;
    private String spessore;
    private Foglio[] fogli;

    public Raccoglitore(){}

    public Raccoglitore(String colore, String spessore, Foglio[] foglio){
        this.colore = colore;
        this.spessore = spessore;
        this.fogli = foglio;
    }

    public String getColore(){
        return this.colore;
    }

    public String getSpessore(){
        return this.spessore;
    }

    public Foglio[] getFogli(){
        return this.fogli;
    }

    public void setFogli(Foglio[] fogli){
        this.fogli = fogli;
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public void setSpessore(String spessore){
        this.spessore = spessore;
    }

    @Override
    public String toString(){
        return "Colore: " + this.colore + ", Spessore: " + this.spessore + ", Fogli contenuti: " + this.fogli.length;
    }

    public void addToFogli (Foglio foglioDaAggiungere){
        this.fogli = new Foglio[fogli.length + 1];
        fogli[fogli.length-1] = foglioDaAggiungere;
    }

    public boolean removeFromFogli(int index){
        for (int i = 0; i < this.fogli.length-1; i++){
            if (index == i ){
                this.fogli[index] = null;
            }
           if (fogli[i] == null){
               fogli[i] = fogli[i+1];
           }
        }
        if (index == fogli.length-1){
            this.fogli[fogli.length-1] = null;
        }
        Foglio[] newFogli = new Foglio[fogli.length-1];
        for(int i = 0; i < newFogli.length; i ++){
            newFogli[i] = fogli[i];
        }
        this.fogli = newFogli;
        return true;
    }
}
