// Matricula.java
import java.util.ArrayList;
import java.util.List;

public class Matricula {
    // Listas para guardar os objetos que existem de forma independente
    private List<Estudante> estudantes = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    // Construtor que recebe os objetos já criados
    public Matricula(Estudante estudante, Curso curso) {
        System.out.println("Matriculando " + estudante.getNome() + " no curso de " + curso.getNome());
    }

    // Apenas para ilustrar como seria uma classe principal gerenciando isso
    public static void main(String[] args) {
        // Criamos os objetos. Eles existem por conta própria.
        Estudante ana = new Estudante("Ana");
        Estudante bruno = new Estudante("Bruno");

        Curso javaBasico = new Curso("Java Básico");
        Curso pythonParaDados = new Curso("Python para Dados");

        System.out.println("--- Realizando Matrículas ---");

        // A classe Matricula apenas LIGA objetos que já existem.
        Matricula matricula1 = new Matricula(ana, javaBasico);
        Matricula matricula2 = new Matricula(ana, pythonParaDados); // Ana em 2 cursos
        Matricula matricula3 = new Matricula(bruno, javaBasico);    // Bruno no mesmo curso que Ana

        // Note que se o objeto 'javaBasico' fosse deletado,
        // os estudantes 'ana' e 'bruno' continuariam existindo.
        // Isso prova que NÃO é uma composição.
    }
}