import java.util.ArrayList;
import java.util.List;

class Professor {
    String nome;
    List<Aluno> alunos = new ArrayList<>(); // associação 1:N

    Professor(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}