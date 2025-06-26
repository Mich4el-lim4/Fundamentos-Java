import java.util.ArrayList;
import java.util.List;

public class TurmaUmParaMuitos {
    String nomeTurma;
    List<AlunoSimples> alunos;

    TurmaUmParaMuitos(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();
    }

    void adicionarAluno(AlunoSimples aluno) {
        alunos.add(aluno);
    }

    void listarAlunos() {
        System.out.println("Turma: " + nomeTurma);
        for (AlunoSimples a : alunos) {
            System.out.println("- " + a.nome);
        }
    }
}
