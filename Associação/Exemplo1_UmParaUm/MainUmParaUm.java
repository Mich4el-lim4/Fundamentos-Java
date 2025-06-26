public class MainUmParaUm {
    public static void main(String[] args) {
        Endereco end = new Endereco("Rua das Flores", "Curitiba");
        AlunoUmParaUm aluno = new AlunoUmParaUm("Maria", end);
        aluno.exibirDados();
    }
}
