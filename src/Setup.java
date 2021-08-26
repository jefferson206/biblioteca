import entidades.Aluno;
import entidades.Funcionario;
import entidades.Livro;
import enums.Situacao;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Setup {
    Funcionario funcionario = new Funcionario();
    Aluno aluno = new Aluno();
    Livro livro = new Livro();

    public void setupFuncionario(List<Funcionario> funcionarios) {
        funcionario = novoFuncionario();
        funcionario.setNome("Paula Nascimento");
        funcionario.setFuncao("Bibliotecario");
        funcionario.setLogin("paula");
        funcionarios.add(funcionario);

        funcionario = novoFuncionario();
        funcionario.setNome("Paulo Ricardo");
        funcionario.setFuncao("Atendente");
        funcionario.setLogin("ricardo");
        funcionarios.add(funcionario);
    }

    public void setupAluno(List<Aluno> alunos) {
        aluno = novoAluno();
        aluno.setNome("Nicoli Nayara");
        aluno.setCurso("Administração");
        aluno.setSemestre("8");
        aluno.setLogin("nicoli");
        alunos.add(aluno);

        aluno = novoAluno();
        aluno.setNome("Barbara dos reis");
        aluno.setCurso("Jornalismo");
        aluno.setSemestre("5");
        aluno.setLogin("barbara");
        alunos.add(aluno);

        aluno = novoAluno();
        aluno.setNome("Jefferson");
        aluno.setCurso("Ciência da computação");
        aluno.setSemestre("8");
        aluno.setLogin("jefferson");
        alunos.add(aluno);
    }

    public void setupLivro(List<Livro> livros) {
        livro = novoLivro();
        livro.setTitulo("As longas tranças do careca");
        livro.setSituacao(Situacao.DISPONIVEL);
        livros.add(livro);


        livro = novoLivro();
        livro.setTitulo("As pontas da mesa redonda");
        livro.setSituacao(Situacao.DISPONIVEL);
        livros.add(livro);

        livro = novoLivro();
        livro.setTitulo("Everywhere");
        livro.setSituacao(Situacao.EMPRESTADO);
        livro.setDataEmprestimo(new Date());
        livros.add(livro);
    }

    private Livro novoLivro() {
        Livro livro = new Livro();
        livro.setAutor("Lesley Banzie");
        livro.setAnoPublicacao(2022);
        livro.setEditora("PIXAR");
        livro.setDataEmprestimo(null);
        livro.setDataDevolucao(null);
        return livro;
    }

    private Funcionario novoFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setTelefone("(44) 3356-8239");
        funcionario.setCpf("090.443.878-95");
        funcionario.setDataNascimento("24/05/1994");
        funcionario.setLogradouro("Rua");
        funcionario.setEndereco("Joao paulo ribeiro");
        funcionario.setNumero("29a");
        funcionario.setCep("87023-590");
        funcionario.setBairro("Rebouças");
        funcionario.setSenha(1234);
        return funcionario;
    }

    private Aluno novoAluno() {
        Aluno aluno = new Aluno();
        aluno.setTelefone("(44) 3356-8239");
        aluno.setCpf("090.443.878-95");
        aluno.setDataNascimento("24/05/1994");
        aluno.setLogradouro("Rua");
        aluno.setEndereco("Joao paulo ribeiro");
        aluno.setNumero("29a");
        aluno.setCep("87023-590");
        aluno.setBairro("Rebouças");
        aluno.setSenha(1234);
        return aluno;
    }
}
