import java.util.List;

public  class Coordenadores extends Funcionario {

  private   List<Professor> professor;

    public Coordenadores(String nome, String cpf, int nr, int ol, double salario, double reembolso) {
        super(nome, cpf, nr, ol, salario, reembolso);
    }

    public void adicionaProfessor(Professor r){
    int limite = 10;
    if (professor.size() <= limite) {

    professor.add(r);
    System.out.println("Adicionado professor");
} else  {
System.out.println("Infelizmente não tem mais como continuar");
    }

    }

    public double aumentoSalario() {
        return getSalario() * 1.5;
    }

}
