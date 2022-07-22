import java.util.List;
public class Professor extends Funcionario{

    private String graduacao;
    private     String disciplinaMinistrada;
    private     int qtdAlunos;
    private    int qtdTurmas;
    private List <Turma> turmas;
    private List <Estagiario> estagiario;

    public Professor(String nome, String cpf, int nr, int ol, double salario, String graduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas, double reembolso){
        super(nome, cpf, nr, ol, salario, reembolso);
    this.graduacao = graduacao;
    this.disciplinaMinistrada = disciplinaMinistrada;
    this.qtdAlunos =qtdAlunos;
    this.qtdTurmas =qtdTurmas;
        this.turmas = turmas;
    this.estagiario= estagiario;
    }


    public void adicionarEstagiario(Estagiario es) {
    int limite = 2;
    if (estagiario.size() <= limite) {
    estagiario.add(es);
    }
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao){
        this.graduacao = graduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this. qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
    this.qtdTurmas = qtdTurmas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void adicionaTurma(){
        this.qtdAlunos = qtdAlunos;
    }

    private int calcularQtdTurmas(List<Turma> turmas){
        return turmas.size();
    }






}
