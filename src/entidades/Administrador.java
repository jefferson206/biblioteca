package entidades;

import interfaces.ILogin;

import java.util.List;
import java.util.Map;

public class Administrador implements ILogin<Administrador> {
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
        Map<String, Object> logar = ILogin.logar();
        String nome = (String) logar.get("login");
        int senha = (int) logar.get("senha");
        boolean acesso = getLogin().equals(nome) && getSenha().equals(senha);
        ILogin.validaLoginSenha(acesso, "menuPrincipalDoAdministrador");
        return acesso;
    }
}
