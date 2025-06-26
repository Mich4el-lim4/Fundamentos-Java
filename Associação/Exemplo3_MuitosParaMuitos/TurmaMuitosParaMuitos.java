import java.util.ArrayList;
import java.util.List;

public class TurmaMuitosParaMuitos {
    String nomeTurma;
    List<AlunoMuitosParaMuitos> alunos;

    TurmaMuitosParaMuitos(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();
    }

    void adicionarAluno(AlunoMuitosParaMuitos aluno) {
        alunos.add(aluno);
    }

    void listarAlunos() {
        System.out.println("Turma " + nomeTurma + " tem os alunos:");
        for (AlunoMuitosParaMuitos a : alunos) {
            System.out.println("- " + a.nome);
        }
    }
}
