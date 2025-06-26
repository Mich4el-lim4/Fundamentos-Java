import java.util.ArrayList;
import java.util.List;

class Turma {
    String nome;
    List<Aluno> alunos = new ArrayList<>();

    Turma(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.adicionarTurma(this); // relação bidirecional
    }
}