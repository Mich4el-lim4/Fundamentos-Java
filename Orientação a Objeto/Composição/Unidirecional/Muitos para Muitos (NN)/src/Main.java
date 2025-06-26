public class Main {
    public static void main(String[] args){
        Aluno maria = new Aluno("Maria");
        Aluno joao = new Aluno("João");

        Turma turma1 = new Turma("Matemática");
        Turma turma2 = new Turma("História");

        turma1.adicionarAluno(maria);
        turma1.adicionarAluno(joao);
        turma2.adicionarAluno(maria);

    }
}
