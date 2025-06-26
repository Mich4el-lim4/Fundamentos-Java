// Comodo.java
// A classe "parte".
public class Comodo {
    private String nome;

    public Comodo(String nome) {
        this.nome = nome;
        System.out.println(" -> Cômodo '" + this.nome + "' foi criado.");
    }

    public String getNome() {
        return nome;
    }
}