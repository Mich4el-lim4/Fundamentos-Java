// Main.java
public class Main {
    public static void main(String[] args) {
        CasaComComodos minhaCasa = new CasaComComodos();

        System.out.println("--------------------");

        minhaCasa.listarComodos();

        // Assim como no exemplo anterior, se 'minhaCasa' for destruída,
        // a lista de 'comodos' e todos os objetos Comodo dentro dela também serão.
    }
}