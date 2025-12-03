package it.prova.utility;

public class Operaio extends Lavoratore{
    private int salario;

    public Operaio(){}

    public Operaio(String nome, String cognome, int salario){
        super(nome, cognome);
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    @Override
    public String percepisco(){
        return "io percepisco " + this.salario;
    }

    public static int contaQuantiOperai(Lavoratore []input){
        int result = 0;
        for(int i = 0; i < input.length; i++){
            if (input[i] instanceof Operaio){
                result ++;
            }
        }
        return result;
    }
}
