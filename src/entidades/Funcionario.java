package entidades;

import interfaces.Login;

import java.util.List;
import java.util.Map;

public class Funcionario extends Pessoa implements Login {
    private String funcao;
    private String login;
    private Integer senha;

    public Funcionario() {
    }

    public Funcionario(String logradouro, String endereco, String numero, String cep, String bairro,
                       String nome, String dataNascimento, String cpf, String telefone,
                       String funcao, String login, Integer senha) {
        super(logradouro, endereco, numero, cep, bairro, nome, dataNascimento, cpf, telefone);
        this.funcao = funcao;
        this.login = login;
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) { this.login = login; }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

        @Override
    public String toString() {
        return "Funcionario{" +
                "funcao='" + funcao + '\'' +
                ", login='" + login + '\'' +
                ", senha=" + senha +
                '}';
    }

    public boolean logarNaAplicacao(List<Funcionario> funcionarios) throws InterruptedException {
        Map<String, Object> logar = logar();
        String nome = (String) logar.get("login");
        int senha = (int) logar.get("senha");
        boolean acesso = funcionarios.stream().anyMatch(p -> p.getLogin().equals(nome) && p.getSenha().equals(senha));
        validaLoginSenha(acesso);
        return acesso;
    }
}
