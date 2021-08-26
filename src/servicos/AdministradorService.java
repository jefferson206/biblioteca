package servicos;

import entidades.Aluno;
import entidades.Funcionario;
import entidades.formularios.FormCadastroAdmin;
import interfaces.IServicosGerais;

import java.util.*;

public class AdministradorService implements IServicosGerais {
    Scanner scanner = new Scanner(System.in);

    FormCadastroAdmin formCadastroAdmin = new FormCadastroAdmin();

    Aluno aluno = new Aluno();
    Funcionario funcionario = new Funcionario();

    public Funcionario cadastrarFuncionario() throws Exception {
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

    public Aluno cadastrarAluno() throws Exception {
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
}
