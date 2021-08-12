package entidades;

import interfaces.Login;
import uteis.Menu;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Administrador implements Login<Administrador> {
    private final String login = "admin";
    private final Integer senha = 1234;

    public Administrador() {
    }

    public String getLogin() {
        return login;
    }

    public Integer getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "login='" + login + '\'' +
                ", senha=" + senha +
                '}';
    }

    @Override
    public boolean logarNaAplicacao(List<Administrador> administrador) throws Exception {
        Map<String, Object> logar = logar();
        String nome = (String) logar.get("login");
        int senha = (int) logar.get("senha");
        boolean acesso = getLogin().equals(nome) && getSenha().equals(senha);
        validaLoginSenha(acesso, "menuPrincipalDoAdministrador");
        return acesso;
    }
}
