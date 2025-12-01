package it.prova.utility;

public class NumberUtility {
    public static boolean isArrayDiNumeriPari(int[] numeriInput){
        for(int i = 0; i < numeriInput.length; i++){
            if (numeriInput[i]%2 != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean esisteAlmenoUnNegativoPari(int[] input){
        for (int i = 0; i < input.length; i++){
            if (input[i] < 0 && (input[i]*(-1) % 2) == 0){
                return true;
            }
        }
        return false;
    }

    public static int sommaElementiInPosizioneDispari(int[] input){
        int result = 0;
        for (int i = input.length -1; i >= 0; i--){
            if (i%2 != 0){
                result += input[i];
            }
        }
        return result;
    }
}
