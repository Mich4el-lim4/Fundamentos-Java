import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        SistemaInterno sistemaInterno = new SistemaInterno();

        do {

            int option = sistemaInterno.mainMenu();

            switch (option) {
                case 1 -> sistemaInterno.menuBusca();
                //case 2 ->
                //case 3 ->
                //case 4 ->
                //case 5 -> System.exit(0);
            }
        }while (true);

    }
}
