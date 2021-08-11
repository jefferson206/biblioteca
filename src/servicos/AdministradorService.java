package servicos;

import entidades.Aluno;
import entidades.Funcionario;
import entidades.Livro;
import entidades.formularios.FormCadastroAdmin;
import entidades.formularios.FormCadastroGeral;

import java.util.*;
import java.util.stream.Collectors;

public class AdministradorService {
    Scanner scanner = new Scanner(System.in);

    FormCadastroAdmin formCadastroAdmin = new FormCadastroAdmin();

    Aluno aluno = new Aluno();
    Livro livro = new Livro();
    Funcionario funcionario = new Funcionario();

    public Funcionario cadastrarFuncionario() {
        Map<String, Object> objectMap = formCadastroAdmin.formularioCadastroPessoa();
        funcionario.setNome((String) objectMap.get("nome"));
        funcionario.setTelefone((String) objectMap.get("telefone"));
        funcionario.setCpf((String) objectMap.get("cpf"));
        funcionario.setDataNascimento((String) objectMap.get("dataNascimento"));

        objectMap = formCadastroAdmin.formularioCadastroEndereco();
        funcionario.setLogradouro((String) objectMap.get("logradouro"));
        funcionario.setEndereco((String) objectMap.get("endereco"));
        funcionario.setNumero((String) objectMap.get("numero"));
        funcionario.setCep((String) objectMap.get("cep"));
        funcionario.setBairro((String) objectMap.get("bairro"));

        System.out.print("Função: ");
        funcionario.setFuncao(scanner.nextLine());
        objectMap = formCadastroAdmin.formularioCadastroLogin();
        funcionario.setLogin((String) objectMap.get("login"));
        funcionario.setSenha((Integer) objectMap.get("senha"));

        return funcionario;
    }

    public void listarFuncionarios(List<Funcionario> funcionarios) {
        funcionarios.stream().map(func -> "NOME: " + func.getNome() + "\nFUNÇÃO: " + func.getFuncao() +"\n")
                .forEachOrdered(System.out::println);
    }

    public void deletarFuncionario(List<Funcionario> funcionarios, String nome) {
        int tamanhoInicial = funcionarios.size();
        funcionarios.removeIf(funcionario -> nome.equals(funcionario.getNome()));
        if (tamanhoInicial == funcionarios.size()) cadastroInexistente();
        else sucesso();
    }

    public Set<Funcionario> buscaFuncionarioPeloLoginSenha(List<Funcionario> funcionarios, String login, int senha) {
        return funcionarios.stream().filter(p -> p.getLogin().equals(login) && p.getSenha().equals(senha)).collect(Collectors.toSet());
    }

    public Aluno cadastrarAluno() {
        Map<String, Object> objectMap = formCadastroAdmin.formularioCadastroPessoa();
        aluno.setNome((String) objectMap.get("nome"));
        aluno.setTelefone((String) objectMap.get("telefone"));
        aluno.setCpf((String) objectMap.get("cpf"));
        aluno.setDataNascimento((String) objectMap.get("dataNascimento"));

        objectMap = formCadastroAdmin.formularioCadastroEndereco();
        aluno.setLogradouro((String) objectMap.get("logradouro"));
        aluno.setEndereco((String) objectMap.get("endereco"));
        aluno.setNumero((String) objectMap.get("numero"));
        aluno.setCep((String) objectMap.get("cep"));
        aluno.setBairro((String) objectMap.get("bairro"));

        System.out.print("Curso: ");
        aluno.setCurso(scanner.nextLine());
        System.out.print("Semestre: ");
        aluno.setSemestre(scanner.nextLine());
        objectMap = formCadastroAdmin.formularioCadastroLogin();
        aluno.setLogin((String) objectMap.get("login"));
        aluno.setSenha((Integer) objectMap.get("senha"));

        return aluno;
    }

    public void listarAlunos(List<Aluno> alunos) {
        alunos.stream().map(aluno -> "NOME: " + aluno.getNome() +
                "\nSEMESTRE: " + aluno.getSemestre() +
                "\nCURSO: " + aluno.getCurso() + "\n")
                .forEachOrdered(System.out::println);
    }

    public void deletarAluno(List<Aluno> alunos, String nome) {
        int tamanhoInicial = alunos.size();
        alunos.removeIf(aluno -> nome.equals(aluno.getNome()));
        if (tamanhoInicial == alunos.size()) cadastroInexistente();
        else sucesso();
    }

    public Livro cadastrarLivro() {
        Map<String, Object> objectMap = formCadastroAdmin.formularioCadastroLivro();
        livro.setTitulo((String) objectMap.get("titulo"));
        livro.setAutor((String) objectMap.get("autor"));
        livro.setAnoPublicacao((Integer) objectMap.get("anoPublicacao"));
        livro.setEditora((String) objectMap.get("editora"));
        return livro;
    }

    public void listarLivros(List<Livro> livros) {
        livros.stream().map(livro -> "TITULO: " + livro.getTitulo() +
                "\nAUTOR: " + livro.getAutor() + "\n")
                .forEachOrdered(System.out::println);
    }

    public void deletarLivro(List<Livro> livros, String titulo) {
        int tamanhoInicial = livros.size();
        livros.removeIf(livro -> titulo.equals(livro.getTitulo()));
        if (tamanhoInicial == livros.size()) cadastroInexistente();
        else sucesso();
    }

    private void cadastroInexistente() {
        System.out.println("OOOOOPS... Cadastro inexistente");
    }

    private void sucesso() {
        System.out.println("S U C E S S O . . . . . ");
    }
}
