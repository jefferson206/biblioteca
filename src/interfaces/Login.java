package interfaces;

import uteis.Menu;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public interface Login<T> {
    Map<String, Object> objectHashMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public abstract boolean logarNaAplicacao(List<T> list) throws Exception;

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

    default void validaLoginSenha(boolean acesso, String funcaoDoMenu) throws Exception {
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
        Method funcao = Menu.class.getMethod(funcaoDoMenu);
        funcao.invoke(menu);
        return;
    }
}
