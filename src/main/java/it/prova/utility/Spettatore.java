package it.prova.utility;

public class Spettatore {
    private String nome;
    private String cognome;
    private int numeroCartaDiCredito;
    private Biglietto biglietto;

    public Spettatore(){}

    public Spettatore(String nome, String cognome, int numeroCartaDiCredito, Biglietto biglietto){
        this.nome = nome;
        this.cognome = cognome;
        this.numeroCartaDiCredito = numeroCartaDiCredito;
        this.biglietto = biglietto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getNumeroCartaDiCredito() {
        return numeroCartaDiCredito;
    }

    public void setNumeroCartaDiCredito(int numeroCartaDiCredito) {
        this.numeroCartaDiCredito = numeroCartaDiCredito;
    }

    public Biglietto getBiglietto() {
        return biglietto;
    }

    public void setBiglietto(Biglietto biglietto) {
        this.biglietto = biglietto;
    }

    public int incassoDeiPagantiNellaMiaFila(Spettatore[] elencoPagantiTotali){
        int result = 0;
        for (int i = 0; i < elencoPagantiTotali.length; i++){
            if (elencoPagantiTotali[i].getBiglietto().getLetteraFila() == this.getBiglietto().getLetteraFila()){
                result += elencoPagantiTotali[i].getBiglietto().getPrezzo();
            }
        }
        result += this.getBiglietto().getPrezzo();
        return result;
    }

    public int numeroSpettatoriDelMioStessoSpettacolo(Spettatore[] elencoPagantiTotali){
        int result = 1;
        for (int i = 0; i < elencoPagantiTotali.length; i++){
            if (elencoPagantiTotali[i].getBiglietto().getNomeSpettacolo().equals(this.getBiglietto().getNomeSpettacolo())){
                result ++;
            }
        }
        return result;
    }

    public boolean numeroSpettatoriMioSpettacoloSuperaAspettativa(Spettatore[] paganti, int aspettativa){
      int result = 1;
      for (int i = 0; i < paganti.length; i++){
          if (paganti[i].getBiglietto().getNomeSpettacolo().equals(this.getBiglietto().getNomeSpettacolo())){
              result++;
          }
        }
      if (result > aspettativa){
          return true;
      }
      return false;
    }
}
