import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaInterno {

    Scanner sc = new Scanner(System.in);
    List<Cliente> cliente = new ArrayList<>();
    Pessoa pessoa;

    public int mainMenu() {
        System.out.println("1 - Usuario cliente");
        System.out.println("2 - Usuario funcionario");
        System.out.print("Digite numero da opção: ");
        return sc.nextInt();
    }

    public void menuBusca() {
        System.out.print("Digite o cpf: ");
        Auhentication(sc.next());
    }

//    public void menuCadastro() {
//        System.out.print("Digite a senha: ");
//        login(sc.next());
//    }


    public void menufuncionario() {
        System.out.print("Cadastrar um item: ");
        String cpf = sc.next();

    }

    public void Auhentication(String cpf) {

        if (cliente.isEmpty()) {
            System.out.println("Não a registro deste cpf");
            System.out.println();
            System.out.print("Gostaria de criar um registro(1 - sim / 2 - não): ");
            int option = sc.nextInt();

            if (option == 1) {
                criarRegistro();
            } else if (option == 2) {
                mainMenu();
            } else {
                System.out.println("Opção invalida");
            }
        } else {
            for (int i = 0; i < cliente.size(); i++) {
                if (cliente.get(i).pessoa.getCpf().equals(cpf)) {
                    System.out.print("Digite a senha: ");
                    int senha = sc.nextInt();

                    if (cliente.get(i).getSenha().equals(senha)){
                        System.out.println("Connected");
                    }
                }
            }
        }


//        for (int i = 0; i < cliente.size(); i++) {
//            if (cliente.get(i).pessoa.getCpf().equals(cpf)) {
//            }
//
//        } else{
//
//        }
    }

    public void criarRegistro() {
//        System.out.print("Digite o nome: ");
//        String nome = sc.next();
        System.out.print("Digite o cpf: ");
        String cpf = sc.next();
        System.out.println();

//        System.out.println("Endereço----------");
//        System.out.print("Digite o estado: ");
//        String estado = sc.next();
//        System.out.print("Digite o cidade: ");
//        String cidade = sc.next();
//        System.out.print("Digite o bairro: ");
//        String bairro = sc.next();
//        System.out.print("Digite o rua: ");
//        String rua = sc.next();
//        System.out.print("Digite o numero: ");
//        String numero = sc.next();
//        System.out.print("Digite o cep: ");
//        String cep = sc.next();
//        System.out.println();
//
//        System.out.println("Contato----------");
//        System.out.print("Digite o email: ");
//        String email = sc.next();
//        System.out.print("Digite o telefone: ");
//        String telefone = sc.next();
//        System.out.println();

        System.out.println("Senha----------");
        System.out.print("crie uma senha: ");
        int senha = sc.nextInt();

        new Pessoa(cpf);
        //new Address(estado, cidade, bairro, rua, cep, numero);
        cliente.add(new Cliente(senha));

    }

}
