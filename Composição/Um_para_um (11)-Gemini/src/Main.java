// Main.java
public class Main {
    public static void main(String[] args) {
        // Ao criar a casa, a fundação é criada automaticamente junto.
        Casa minhaCasa = new Casa();

        System.out.println("--------------------");

        minhaCasa.verificarFundacao();

        // Se 'minhaCasa' for destruída pelo Coletor de Lixo do Java (Garbage Collector),
        // o objeto 'fundacao' que pertence a ela também será, pois ninguém mais tem acesso a ele.
    }
}
