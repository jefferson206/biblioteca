package escolhas;

import entidades.Administrador;
import entidades.Aluno;
import entidades.Funcionario;
import entidades.Livro;
import uteis.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EscolhaPrincipal {
    List<Administrador> administradores = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    boolean acesso = false;

    public void getEscolhaPrincipal(int escolha, List<Funcionario> funcionarios, List<Aluno> alunos, List<Livro> livros) throws Exception {
        switch (escolha) {
            case 1:
                Administrador administrador = new Administrador();
                EscolhaAdmin escolhaAdmin = new EscolhaAdmin();
                acesso = administrador.logarNaAplicacao(administradores);
                if (!acesso) break;
                int escolhaAdminSwitch;
                do {
                    escolhaAdminSwitch = scanner.nextInt();
                    escolhaAdmin.getEscolhaAdmin(escolhaAdminSwitch, funcionarios, alunos, livros);
                } while (escolhaAdminSwitch != 10);
                menu.limparTela();
                menu.menuPrincipal();
                break;
            case 2:
                Funcionario funcionario = new Funcionario();
                EscolhaFuncionario escolhaFuncionario = new EscolhaFuncionario();
                acesso = funcionario.logarNaAplicacao(funcionarios);
                if (!acesso) break;
                int escolhaFuncionarioSwitch;
                do {
                    escolhaFuncionarioSwitch = scanner.nextInt();
                    escolhaFuncionario.getEscolhaFuncionario(escolhaFuncionarioSwitch, funcionarios, alunos, livros);
                } while (escolhaFuncionarioSwitch != 10);
                menu.limparTela();
                menu.menuPrincipal();
                break;
            case 3:
                Aluno aluno = new Aluno();
                EscolhaAluno escolhaAluno = new EscolhaAluno();
                acesso = aluno.logarNaAplicacao(alunos);
                if (!acesso) break;
                int escolhaAlunoSwitch;
                do {
                    escolhaAlunoSwitch = scanner.nextInt();
                    escolhaAluno.getEscolhaAluno(escolhaAlunoSwitch, alunos, livros);
                } while (escolhaAlunoSwitch != 5);
                menu.limparTela();
                menu.menuPrincipal();
                break;
            case 4:
                break;
            default:
                menu.escolhaInvalida();
                menu.menuPrincipal();
                break;
        }
    }
}
