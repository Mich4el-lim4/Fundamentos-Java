package src;

public class AlunoUmParaUm {
    String nome;
    Endereco endereco;

    AlunoUmParaUm(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco.rua + ", " + endereco.cidade);
    }
}
