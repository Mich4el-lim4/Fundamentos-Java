class Pessoa {
    String nome;
    Documento documento; // associação 1:1

    Pessoa(String nome, Documento documento) {
        this.nome = nome;
        this.documento = documento;
    }
}