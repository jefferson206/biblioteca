package interfaces;

import excecoes.TratamentoDeExcecoes;
import uteis.Menu;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public interface ILogin<T> {
    Map<String, Object> objectHashMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    TratamentoDeExcecoes excecoes = new TratamentoDeExcecoes();

    static Map<String, Object> logar() throws Exception {
        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();
        if (login.isEmpty()) login = scanner.nextLine();
        objectHashMap.put("login", login);
        System.out.print("Digite sua senha: ");
        Method funcao = ILogin.class.getMethod("mensagemTipoInvalido");
        int senha = excecoes.validaTipoInteiro(scanner, excecoes, funcao);
        objectHashMap.put("senha", senha);
        return objectHashMap;
    }

    static void validaLoginSenha(boolean acesso, String funcaoDoMenu) throws Exception {
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

    static void mensagemTipoInvalido() {
        System.out.println("Senha deve ser somente números");
        System.out.print("Digite sua senha: ");
    }

    boolean logarNaAplicacao(List<T> list) throws Exception;
}
