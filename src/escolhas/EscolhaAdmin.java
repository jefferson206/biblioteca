package escolhas;

import entidades.Aluno;
import entidades.Funcionario;
import entidades.Livro;
import servicos.AdministradorService;
import uteis.Menu;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

public class EscolhaAdmin {
    Method funcao = null;
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);

    String nome;

    AdministradorService service = new AdministradorService();

    public void getEscolhaAdmin(int escolhaAdminSwitch, List<Funcionario> funcionarios, List<Aluno> alunos, List<Livro> livros) throws Exception {
        switch (escolhaAdminSwitch) {
            case 1:
                System.out.println("Cadastrar funcionario");
                funcionarios.add(service.cadastrarFuncionario());
                funcao = Menu.class.getMethod("menuPrincipalDoAdministrador");
                menu.cadastroRealizadoComSucesso(menu, funcao);
                break;
            case 2:
                System.out.println("Cadastrar Aluno");
                alunos.add(service.cadastrarAluno());
                funcao = Menu.class.getMethod("menuPrincipalDoAdministrador");
                menu.cadastroRealizadoComSucesso(menu, funcao);
                break;
            case 3:
                System.out.println("Cadastrar Livro");
                livros.add(service.cadastrarLivro());
                funcao = Menu.class.getMethod("menuPrincipalDoAdministrador");
                menu.cadastroRealizadoComSucesso(menu, funcao);
                break;
            case 4:
                funcao = AdministradorService.class.getMethod("listarFuncionarios", List.class);
                menu.listagemReflection(" FUNCIONARIOS ", funcao, service, funcionarios, true);
                menu.menuPrincipalDoAdministrador();
                break;
            case 5:
                funcao = AdministradorService.class.getMethod("listarAlunos", List.class);
                menu.listagemReflection("--- ALUNOS ---", funcao, service, alunos, true);
                menu.menuPrincipalDoAdministrador();
                break;
            case 6:
                funcao = AdministradorService.class.getMethod("listarLivros", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, service, livros, true);
                menu.menuPrincipalDoAdministrador();
                break;
            case 7:
                funcao = AdministradorService.class.getMethod("listarFuncionarios", List.class);
                menu.listagemReflection(" FUNCIONARIOS ", funcao, service, funcionarios, false);
                perguntaDeExclusao("funcionário");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                if (nome.isEmpty()) {
                    menu.menuPrincipalDoAdministrador();
                    break;
                }
                service.deletarFuncionario(funcionarios, nome);
                menu.sleepClear();
                menu.menuPrincipalDoAdministrador();
                break;
            case 8:
                funcao = AdministradorService.class.getMethod("listarAlunos", List.class);
                menu.listagemReflection("--- ALUNOS ---", funcao, service, alunos, false);
                perguntaDeExclusao("aluno");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                if (nome.isEmpty()) {
                    menu.menuPrincipalDoAdministrador();
                    break;
                }
                service.deletarAluno(alunos, nome);
                menu.sleepClear();
                menu.menuPrincipalDoAdministrador();
                break;
            case 9:
                funcao = AdministradorService.class.getMethod("listarLivros", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, service, livros, false);
                perguntaDeExclusao("titulo do livro");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                if (nome.isEmpty()) {
                    menu.menuPrincipalDoAdministrador();
                    break;
                }
                service.deletarLivro(livros, nome);
                menu.sleepClear();
                menu.menuPrincipalDoAdministrador();
                break;
            case 10:
                break;
            default:
                menu.escolhaInvalida();
                break;
        }
    }

    private void perguntaDeExclusao(String oQueExcluir) {
        System.out.println("Digite o " + oQueExcluir + " que deseja excluir do sistema, ou precione enter para voltar...");
    }
}