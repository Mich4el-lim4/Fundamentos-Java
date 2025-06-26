import java.util.ArrayList;
import java.util.List;

class Aluno {
    String nome;
    List<Turma> turmas = new ArrayList<>(); // associação N:N

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }
}