package entidades;

import interfaces.Login;

import java.util.List;
import java.util.Map;

public class Aluno extends Pessoa implements Login<Aluno> {
    private String login;
    private Integer senha;
    private String curso;
    private String semestre;

    public Aluno() {
    }

    public Aluno(String logradouro, String endereco, String numero, String cep, String bairro,
                 String nome, String dataNascimento, String cpf, String telefone,
                 String login, Integer senha, String curso, String semestre) {
        super(logradouro, endereco, numero, cep, bairro, nome, dataNascimento, cpf, telefone);
        this.login = login;
        this.senha = senha;
        this.curso = curso;
        this.semestre = semestre;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "login='" + login + '\'' +
                ", senha=" + senha +
                ", curso='" + curso + '\'' +
                ", semestre='" + semestre + '\'' +
                '}';
    }

    @Override
    public boolean logarNaAplicacao(List<Aluno> alunos) throws Exception {
        Map<String, Object> logar = logar();
        String nome = (String) logar.get("login");
        int senha = (int) logar.get("senha");
        boolean acesso = alunos.stream().anyMatch(p -> p.getLogin().equals(nome) && p.getSenha().equals(senha));
        validaLoginSenha(acesso, "menuDoAluno");
        return acesso;
    }
}
