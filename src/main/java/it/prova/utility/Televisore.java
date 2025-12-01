package it.prova.utility;

public class Televisore {
    private String marca;
    private String modello;
    private double prezzo;
    private int pollici;

    public Televisore(String marca, String modello, double prezzo, int pollici){
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
        this.pollici = pollici;
    }

    public String getMarca(){
        return this.marca;
    }

    public boolean costaMenoDelBudgetDisponibile(int budgetDisponibile){
        if (this.prezzo < budgetDisponibile){
            return true;
        }
        return false;
    }

    public boolean stessaMarcaDi(Televisore input){
        if(this.marca.equals(input.getMarca())){
            return true;
        }
        return false;
    }

    public static int dimmiQuantiElementiStrettamenteMinoriDi(int[] elementi, int soglia){
        int result = 0;
        for(int i = 0; i < elementi.length; i++){
            if (elementi[i] < soglia){
                result ++;
            }
        }
        return result;
    }

    public static boolean sonoTuttiDentroUnIntervallo(int[]valori, int sogliaMin, int sogliaMax){
        for(int i = 0; i < valori.length; i++){
            if (!(valori[i] >= sogliaMin && valori[i] <= sogliaMax)){
                return false;
            }
        }
        return true;
    }

    public static boolean nomiUgualiNellePrimeNPosizioni(String[]elenco, int nPosizioni){
        String nomeInPrimaPosizione = elenco[0];
        for (int i = 1; i < nPosizioni; i ++){
            if (elenco[i] != elenco[i-1]){
                return false;
            }
        }
        return true;
    }

    public static boolean ePresenteSoloUnaVolta(String[] elenco, String nome){
        int contatore = 0;
        for (int i = 0; i < elenco.length; i ++){
            if (elenco[i].equals(nome)){
                contatore++;
            }
        }
        return contatore == 1 ? true : false;
    }
}
