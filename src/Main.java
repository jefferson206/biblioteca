import entidades.Funcionario;
import escolhas.EscolhaPrincipal;
import uteis.Menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        EscolhaPrincipal escolhaPrincipal = new EscolhaPrincipal();

        Collection<Funcionario> funcionarios = new ArrayList<Funcionario>();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        int escolha;

        menu.menuPrincipal();

        do {
            escolha = scanner.nextInt();
            escolhaPrincipal.getEscolhaPrincipal(escolha, funcionarios);
        } while(escolha != 4);
    }
}
