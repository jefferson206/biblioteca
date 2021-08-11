package escolhas;

import entidades.Administrador;
import entidades.Aluno;
import entidades.Funcionario;
import entidades.Livro;
import uteis.Menu;

import java.util.List;
import java.util.Scanner;

public class EscolhaPrincipal {
    Scanner scanner = new Scanner(System.in);
    EscolhaAdmin escolhaAdmin = new EscolhaAdmin();
    Menu menu = new Menu();
    boolean acesso = false;

    public void getEscolhaPrincipal(int escolha, List<Funcionario> funcionarios, List<Aluno> alunos, List<Livro> livros) throws Exception {
        switch (escolha) {
            case 1:
                Administrador administrador = new Administrador();
                acesso = administrador.logarNaAplicacao();
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
                acesso = funcionario.logarNaAplicacao(funcionarios);
                if (!acesso) break;
//                int escolhaFuncionarioSwitch;
//                do {
//                    escolhaFuncionarioSwitch = scanner.nextInt();
//                    escolhaAdmin.getEscolhaAdmin(escolhaFuncionarioSwitch, funcionarios, alunos, livros);
//                } while (escolhaFuncionarioSwitch != 10);
//                menu.limparTela();
//                menu.menuPrincipal();
                break;
            case 3:

                menu.menuPrincipal();
                break;
            case 4:
                break;
            default:
                menu.escolhaInvalida();
                break;
        }
    }
}
