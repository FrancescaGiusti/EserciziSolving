package it.prova.utility;

public class MyArrayUtility {
    public static int calcolaProdottoNumeriInPosizioneDispari(int[] numeriInput){
        int result = 1;
        for(int i = 1; i < numeriInput.length; i++){
            if (i%2 != 0 ){
                result *= numeriInput[i];
            }
        }
        return result;
    }

    public static String parolaPiuLunga(String[] parole){
        String result = parole[0];
        for(int i = 1; i < parole.length; i++){
            if (parole[i].length() > result.length()){
                result = parole[i];
            }
        }
        return result;
    }

    public static boolean isNomePresente(String nomeDaCercare, String[] nomi){
        for(int i = 0; i < nomi.length; i++){
            if (nomi[i].equals(nomeDaCercare)){
                return true;
            }
        }
        return false;
    }

    public static int quanteVolteEPresente(String[] elenco, String nome){
        int result = 0;
        for (int i = 0; i < elenco.length; i ++){
            if (elenco[i].equals(nome)){
                result ++;
            }
        }
        return result;
    }

    public static boolean verificaSeSommaTotaleElementiEZero(int[] valoriInput){
        int somma = 0;
        for (int i = 0; i < valoriInput.length; i ++){
            somma += valoriInput[i];
        }
        return somma == 0;
    }

    public static int paroleConLunghezzaDispari(String[] parole){
        int result = 0;
        for (int i = 0; i < parole.length; i ++){
            if (parole[i].length() % 2 != 0){
                result ++;
            }
        }
        return result;
    }

    public static int numeriDispariPresenti(int[] numeriInput){
        int result = 0;
        for (int i = 0; i < numeriInput.length; i ++){
            if (numeriInput[i]%2 != 0){
                result++;
            }
        }
        return result;
    }

    public static int sommaNumeriDispari(int[] numeriInput){
        int somma = 0;
        for(int i = 0; i < numeriInput.length; i++){
            if (numeriInput[i]%2 != 0){
                somma += numeriInput[i];
            }
        }
        return somma;
    }

    public static int sommaNumeriInPosizionePari(int[] numeriInput){
        int somma = numeriInput[0];
        for (int i = 1; i < numeriInput.length; i++){
            if (i%2 == 0){
                somma += numeriInput[i];
            }
        }
        return somma;
    }

    public static boolean isNumeroNegativoPresente(int[] numeriInput){
        for(int i = 0; i < numeriInput.length; i++){
            if (numeriInput[i]<0){
                return true;
            }
        }
        return false;
    }

    public static String inverti(String daInvertire){
        String result = "";
        for(int i = daInvertire.length()-1; i >= 0; i--){
            result += daInvertire.charAt(i);
        }
        return result;
    }

    public static boolean sonoTuttiDiUgualeLunghezza(String[] elenco){
        for(int i = 0; i < elenco.length-1; i++){
            if(elenco[i].length() != elenco[i+1].length()){
                return false;
            }
        }
        return true;
    }

    public static boolean terminanoTuttiConIlCarattere(String[] elenco, char finale){
        for (int i = 1; i < elenco.length; i ++){
            if (elenco[i].charAt(elenco[i].length()-1)!= elenco[i-1].charAt(elenco[i-1].length()-1)){
                return false;
            }
        }
        return true;
    }

    public static int sommaLunghezzaNomi(String[] nomi){
        int result = 0;
        for(int i = 0; i < nomi.length; i++){
            result += nomi[i].length();
        }
        return result;
    }
}
