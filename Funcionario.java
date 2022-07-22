public  class Funcionario implements InterfaceReembolso {
    private String nome;
    private String cpf;
    private int nr;
    private int ol;
    private double salario;
    private double reembolso;

    public Funcionario(String nome, String cpf, int nr, int ol, double salario, double reembolso) {
    this.nome = nome;
    this.cpf = cpf;
    this.nr = nr;
    this.ol = ol;
    this.salario = salario;
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

    public String getNome () {
    return nome;
    }

    public void setNome (String nome) {
    this.nome = nome;
    }

    public String getCPF() {
    return cpf;
    }

    public void setCpf (String cpf) {
    this.cpf = cpf;
    }

    public int getNr () {
    return nr;
    }

    public void setNr(int nr) {
    this.nr = nr;
    }

    public int  getOl () {
    return ol;
    }

    public void setOl (int ol) {
    this.ol = ol;
    }

    public double getSalario () {
    return salario;
    }

    public void setSalario(double salario) {
    this.salario = salario;
    }

    public double aumentaSalario () {
    return getSalario() * 1.10;
    }
}
