package it.prova.utility;

public class Nazione {
    private String denominazione;
    private double superficieKmQ;
    private int numeroAbitanti;

    public Nazione(String denominazione, double superficieKmQ, int numeroAbitanti){
        this.denominazione = denominazione;
        this.superficieKmQ  =superficieKmQ;
        this.numeroAbitanti = numeroAbitanti;
    }

    public double getSuperficieKmQ(){
        return this.superficieKmQ;
    }

    public  int getNumeroAbitanti(){
        return this.numeroAbitanti;
    }

    public String getDenominazione(){
        return this.denominazione;
    }

    public boolean piuEstesaDi(Nazione input){
        return this.getSuperficieKmQ() > input.getSuperficieKmQ();
    }

    public boolean piuPopolosaDi(Nazione input){
        return this.getNumeroAbitanti() > input.getNumeroAbitanti();
    }

    public boolean esisteAlmenoUnaPiuEstesa(Nazione[] nazioni){
        for (int i = 0; i < nazioni.length; i ++){
            if (this.getSuperficieKmQ() < nazioni[i].getSuperficieKmQ()){
                return true;
            }
        }
        return false;
    }

    public int dimmiQuanteSonoPiuPopolose(Nazione[] nazioni){
        int result = 0;
        for (int i = 0; i < nazioni.length; i ++){
            if (this.getNumeroAbitanti() < nazioni[i].getNumeroAbitanti()){
                result ++;
            }
        }
        return result;
    }

    public boolean haPiuAbitantiDiTutteLeAltre(Nazione[] nazioni){
        for (int i = 0; i < nazioni.length; i ++){
            if (this.getNumeroAbitanti() < nazioni[i].getNumeroAbitanti()){
                return false;
            }
        }
        return true;
    }

    public boolean hannoTutteLaMiaStessaIniziale(Nazione[] nazioni){
        for(int i = 0; i < nazioni.length; i++){
            if (this.getDenominazione().charAt(0) != nazioni[i].getDenominazione().charAt(0)){
                return false;
            }
        }
        return true;
    }

    public boolean eAlDiSopraDellaMediaComeSuperficie(Nazione[] nazioni){
        int sommaSuperficie = 0;
        for (int i = 0; i < nazioni.length; i ++){
            sommaSuperficie += nazioni[i].getSuperficieKmQ();
        }
        int mediaSuperficie = sommaSuperficie/nazioni.length;
        return this.getSuperficieKmQ() > mediaSuperficie;
    }

}
