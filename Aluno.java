public class Aluno {

    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private String disciplina;

    public Aluno(String nome, int idade, double nota1, double nota2, String disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.disciplina = disciplina;
    };

    public void imprimir1(String nome) {
        System.out.println(nome);
    }

    public void imprimir1() {
        System.out.println();
    }

    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int setIdade(int idade) {
        return this.idade = idade;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double setNota1(double nota1) {
        return this.nota1 = nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double setNota2(double nota2) {
        return this.nota2 = nota2;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public String setDisciplina(String disciplina) {
        return this.disciplina = disciplina;
    }

    public double mediaAluno() {
        double mediaNotas = (nota1 + nota2) / 2;
        return mediaNotas;
    }
}
