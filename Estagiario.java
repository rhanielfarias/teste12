    public class Estagiario implements InterfaceReembolso {
    private double bolsa;
    private String nomeEstagiario;
    private double reembolso;


    public Estagiario(String nome) {
    this.bolsa=bolsa;
    this.nomeEstagiario = nomeEstagiario;
    this.reembolso = reembolso;
    }
        @Override

    public double getReembolso() {
    return reembolso;
    }
        @Override

    public void setReembolso(double reembolso) {
System.out.println("Você tem direito a reembolso");
    }

    public double getBolsa() {
    return bolsa;
    }

    public void setBolsa(double bolsa) {
    this.bolsa= bolsa;
    }


    public String getNomeEstagiario () {
    return nomeEstagiario;
    }
    public void setnomeEstagiario (String nomeEstagiario) {
    this.nomeEstagiario = nomeEstagiario;
    }
}
