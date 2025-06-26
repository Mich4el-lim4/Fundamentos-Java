// CasaComComodos.java
import java.util.ArrayList;
import java.util.List;

// A classe "todo"
public class CasaComComodos {
    // A Casa TEM MUITOS Comodos. Este é o relacionamento 1 para Muitos.
    private final List<Comodo> comodos;

    public CasaComComodos() {
        System.out.println("Construindo uma nova casa com cômodos...");

        // AQUI ACONTECE A COMPOSIÇÃO!
        // A Casa cria e gerencia sua própria lista de cômodos.
        this.comodos = new ArrayList<>();

        // A própria casa decide quais cômodos ela terá ao ser construída.
        this.comodos.add(new Comodo("Quarto"));
        this.comodos.add(new Comodo("Sala de Estar"));
        this.comodos.add(new Comodo("Cozinha"));
        this.comodos.add(new Comodo("Banheiro"));

        System.out.println("A casa com cômodos foi construída.");
    }

    public void listarComodos() {
        System.out.println("A casa possui os seguintes cômodos:");
        for (Comodo comodo : this.comodos) {
            System.out.println(" - " + comodo.getNome());
        }
    }
}