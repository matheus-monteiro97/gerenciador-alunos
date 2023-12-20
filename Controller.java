import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            Aluno estudante = new Aluno("Matheus Monteiro", 19, 10, 8.5, "Sociologia");

            Validator validarDados = new Validator();

            System.out.println("Digite o seu nome:");
            estudante.setNome(scan.nextLine());
            validarDados.erroNome(estudante.getNome(), 20);

            System.out.println("Digite sua idade:");
            estudante.setIdade(scan.nextInt());

            System.out.println("Nota de 1° prova foi?");
            estudante.setNota1(scan.nextDouble());
            validarDados.erroNotas(estudante.getNota1());

            System.out.println("Nota da 2° Prova foi?");
            estudante.setNota2(scan.nextDouble());
            validarDados.erroNotas(estudante.getNota2());

            System.out.println("Sua disciplina é?");
            estudante.setDisciplina(scan.nextLine());

            System.out.println("Sua média é: " + estudante.mediaAluno());
        }

    }

}