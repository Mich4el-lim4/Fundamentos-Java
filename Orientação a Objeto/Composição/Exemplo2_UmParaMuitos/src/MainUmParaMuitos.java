package src;

public class MainUmParaMuitos {
    public static void main(String[] args) {
        TurmaUmParaMuitos turma = new TurmaUmParaMuitos("Java Básico");
        AlunoSimples a1 = new AlunoSimples("João");
        AlunoSimples a2 = new AlunoSimples("Ana");

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        turma.listarAlunos();
    }
}
