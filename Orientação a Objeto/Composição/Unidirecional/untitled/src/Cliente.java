import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private int senha;

    Pessoa pessoa;
    List<Item> compras = new ArrayList<>();

    public Cliente(int senha) {
        this.senha = senha;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
