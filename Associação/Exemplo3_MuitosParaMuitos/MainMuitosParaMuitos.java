public class MainMuitosParaMuitos {
    public static void main(String[] args) {
        AlunoMuitosParaMuitos maria = new AlunoMuitosParaMuitos("Maria");
        AlunoMuitosParaMuitos lucas = new AlunoMuitosParaMuitos("Lucas");

        TurmaMuitosParaMuitos java = new TurmaMuitosParaMuitos("Java");
        TurmaMuitosParaMuitos logica = new TurmaMuitosParaMuitos("Lógica");

        maria.adicionarTurma(java);
        maria.adicionarTurma(logica);
        lucas.adicionarTurma(java);

        java.adicionarAluno(maria);
        java.adicionarAluno(lucas);
        logica.adicionarAluno(maria);

        maria.listarTurmas();
        lucas.listarTurmas();
        java.listarAlunos();
        logica.listarAlunos();
    }
}
