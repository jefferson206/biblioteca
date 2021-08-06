package entidades;

import entidades.formularios.FormCadastroAdmin;
import entidades.formularios.FormCadastroGeral;
import interfaces.ICadastro;
import uteis.Menu;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Administrador implements ICadastro<Funcionario> {
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

    public boolean logar() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        int senha = scanner.nextInt();
        return this.validaLoginSenha(login, senha);
    }

    private boolean validaLoginSenha(String login, int senha) throws InterruptedException {
        Menu menu = new Menu();
        if (!this.getLogin().equals(login) || !this.getSenha().equals(senha)) {
            menu.acessoNegado();
            TimeUnit.SECONDS.sleep(2);
            menu.limparTela();
            menu.menuPrincipal();
            return false;
        }
        menu.acessoPermitido();
        TimeUnit.SECONDS.sleep(2);
        menu.limparTela();
        menu.menuPrincipalDoAdministrador();
        return true;
    }

    public void cadastrarFuncionario(Collection<Funcionario> funcionarios) {
        Funcionario funcionario = new Funcionario();
        cadastrarPessoa(funcionario);
        cadastrarEndereco(funcionario);
        cadastrarLoginFuncionario(funcionario);
        funcionarios.add(funcionario);
    }

    @Override
    public void cadastrarEndereco(Funcionario funcionario) {
        FormCadastroAdmin formCadastroGeral = new FormCadastroAdmin();
        Map<String, Object> objectMap = formCadastroGeral.formularioCadastroEndereco();
        funcionario.setLogradouro((String) objectMap.get("logradouro"));
        funcionario.setEndereco((String) objectMap.get("endereco"));
        funcionario.setNumero((String) objectMap.get("numero"));
        funcionario.setCep((String) objectMap.get("cep"));
        funcionario.setBairro((String) objectMap.get("bairro"));
    }

    @Override
    public void cadastrarAcervo(Funcionario entidade) {
        FormCadastroAdmin formCadastroGeral = new FormCadastroAdmin();
        Map<String, Object> objectMap = formCadastroGeral.formularioCadastroAcervo();

    }

    @Override
    public void cadastrarPessoa(Funcionario funcionario) {
        FormCadastroAdmin formCadastroGeral = new FormCadastroAdmin();
        Map<String, Object> objectMap = formCadastroGeral.formularioCadastroPessoa();
        funcionario.setNome((String) objectMap.get("nome"));
        funcionario.setTelefone((String) objectMap.get("telefone"));
        funcionario.setCpf((String) objectMap.get("cpf"));
        funcionario.setDataNascimento((String) objectMap.get("dataNascimento"));
    }

    private void cadastrarLoginFuncionario(Funcionario funcionario) {
        FormCadastroAdmin formCadastroGeral = new FormCadastroAdmin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Função: ");
        funcionario.setFuncao(scanner.nextLine());
        Map<String, Object> objectMap = formCadastroGeral.formularioCadastroLogin();
        funcionario.setLogin((String) objectMap.get("login"));
        funcionario.setSenha((Integer) objectMap.get("senha"));
    }
}
