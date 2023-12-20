import java.util.List;
import java.util.ArrayList;

public class Alunorepository {
    private List<Aluno> alunoList = new ArrayList<>();

    public void salvarAluno(Aluno estudante) {
        alunoList.add(estudante);
    }

    public Aluno buscarAluno(int index) {
        return alunoList.get(index);
    }

    public List<Aluno> buscarTodos() {
        return alunoList;
    }

    public void deletarAluno(int index) {
        alunoList.remove(index);
        System.out.println("Dados foram apagados");
    }

    public void atualizarAluno(Aluno estudante, int index) {
        alunoList.get(index);
        System.out.println("Dados foram apagados");
    }
}