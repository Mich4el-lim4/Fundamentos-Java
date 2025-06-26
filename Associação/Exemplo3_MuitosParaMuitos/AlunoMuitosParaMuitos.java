import java.util.ArrayList;
import java.util.List;

public class AlunoMuitosParaMuitos {
    String nome;
    List<TurmaMuitosParaMuitos> turmas;

    AlunoMuitosParaMuitos(String nome) {
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }

    void adicionarTurma(TurmaMuitosParaMuitos turma) {
        turmas.add(turma);
    }

    void listarTurmas() {
        System.out.println(nome + " está nas turmas:");
        for (TurmaMuitosParaMuitos t : turmas) {
            System.out.println("- " + t.nomeTurma);
        }
    }
}
