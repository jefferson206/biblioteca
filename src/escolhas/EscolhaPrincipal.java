package escolhas;

import entidades.Administrador;
import entidades.Funcionario;
import uteis.Menu;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Scanner;

public class EscolhaPrincipal {
    Scanner scanner = new Scanner(System.in);
    EscolhaAdmin escolhaAdmin = new EscolhaAdmin();
    Menu menu = new Menu();

    public void getEscolhaPrincipal(int escolha, Collection<Funcionario> funcionarios) throws Exception {
        switch (escolha) {
            case 1:
                Administrador administrador = new Administrador();
                boolean acesso = administrador.logar();
                if (!acesso) break;
                int escolhaAdminSwitch;
                do {
                    escolhaAdminSwitch = scanner.nextInt();
                    escolhaAdmin.getEscolhaAdmin(escolhaAdminSwitch, funcionarios);
                } while (escolhaAdminSwitch != 7);
                menu.limparTela();
                menu.menuPrincipal();
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            default:
                menu.escolhaInvalida();
                break;
        }
    }
}
