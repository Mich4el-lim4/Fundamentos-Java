// Casa.java
// Esta é a classe "todo". Ela controla a existência da sua parte.
public class Casa {
    // A Casa TEM UMA Fundacao. Este é o relacionamento 1 para 1.
    private final Fundacao fundacao; // "final" ajuda a garantir que a fundação não será trocada.

    // No construtor da Casa, nós CRIAMOS a sua fundação.
    // Isso garante que a Fundacao só existe porque a Casa existe.
    public Casa() {
        System.out.println("Construindo uma nova casa...");
        this.fundacao = new Fundacao(); // AQUI ACONTECE A COMPOSIÇÃO!
        System.out.println("A casa foi construída sobre sua fundação.");
    }

    public void verificarFundacao() {
        System.out.println("Verificando a fundação da casa: " + this.fundacao.getTipoDeMaterial());
    }
}