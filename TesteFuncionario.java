import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TesteFuncionario {
    public static  void main(String [] args) {
    Scanner input = new Scanner(System.in);
    List<Estagiario> listaDeEstagiarios = new ArrayList<>();
    List<Professor> listaDeProfessores = new ArrayList<>();
    boolean continuar = true;

    while(continuar) {
System.out.println("Digite uma das op��es abaixo");
System.out.println("1 - Adicionar um professor");
System.out.println("2 - Adicionar um estagi�rio");
System.out.println("3 - Sair");
    int opcao = input.nextInt();
            input.nextLine();

    switch(opcao) {
    case 1:
    if(listaDeProfessores.size() <= 1 && listaDeEstagiarios.size() <=1) {
System.out.println("Informe o nome do professor a adicionar");
    String nomeProfessor = input.nextLine();
    Professor professor = new Professor(nomeProfessor, "010203040506", 5, 80, 12.05, "Ensino m�dio", "Biologia", 5, 2, 11.1);
    listaDeProfessores.add(professor);
    } else {
System.out.println("Sinto muito. N�o pode adicionar mais professor");
}
    break;
    case 2:
    if(listaDeProfessores.size() <= 1 && listaDeEstagiarios.size() <=1) {
System.out.println("Informe o nome do estagi�rio para adicionar");
    String nome = input.nextLine();
    Estagiario estagiario = new Estagiario(nome);
    listaDeEstagiarios.add(estagiario);
    } else {
System.out.println("Sinto muito. S� pode adicionar dois estagi�rios por professor");
}
    break;
    case 3:
    continuar = false;
    break;
    default:
System.out.println("Op��o inv�lida");
    }
}


}
    }
