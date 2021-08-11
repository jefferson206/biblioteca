package interfaces;

import uteis.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public interface Login {
    Map<String, Object> objectHashMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    default Map<String, Object> logar() {
        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();
        if (login.isEmpty()) login = scanner.nextLine();
        objectHashMap.put("login", login);
        System.out.print("Digite sua senha: ");
        int senha = scanner.nextInt();
        objectHashMap.put("senha", senha);
        return objectHashMap;
    }

    // TODO - Refatorar para Reflation para poder passar qual o menu que sera utilizado.
    default void validaLoginSenha(boolean acesso) throws InterruptedException {
        Menu menu = new Menu();
        if (!acesso) {
            menu.acessoNegado();
            TimeUnit.SECONDS.sleep(2);
            menu.limparTela();
            menu.menuPrincipal();
            return;
        }
        menu.acessoPermitido();
        TimeUnit.SECONDS.sleep(2);
        menu.limparTela();
        menu.menuPrincipalDoAdministrador();
        return;
    }
}
