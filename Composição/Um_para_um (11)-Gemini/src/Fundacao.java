// Fundacao.java
// Esta é a classe "parte". Ela não tem muito sentido de existir sozinha.
public class Fundacao {
    private String tipoDeMaterial;

    // O construtor é chamado pela classe "todo" (Casa)
    public Fundacao() {
        this.tipoDeMaterial = "Concreto e Aço";
        System.out.println("Uma fundação de " + this.tipoDeMaterial + " foi criada!");
    }

    public String getTipoDeMaterial() {
        return tipoDeMaterial;
    }
}