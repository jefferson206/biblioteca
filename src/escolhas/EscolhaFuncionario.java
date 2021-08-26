package escolhas;

import entidades.Aluno;
import entidades.Funcionario;
import entidades.Livro;
import servicos.FuncionarioService;
import servicos.LivroService;
import uteis.Menu;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

public class EscolhaFuncionario {
    Method funcao = null;
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);

    LivroService livroService = new LivroService();
    FuncionarioService service = new FuncionarioService();

    String nomeDoLivro;

    public void getEscolhaFuncionario(int escolha, List<Funcionario> funcionarios, List<Aluno> alunos, List<Livro> livros) throws Exception {
        switch (escolha) {
            case 1:
                funcao = LivroService.class.getMethod("listarTodosOsLivros", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, livroService, livros, true);
                menu.menuDoFuncionario();
                break;
            case 2:
                funcao = LivroService.class.getMethod("listarLivrosDisponiveis", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, livroService, livros, true);
                menu.menuDoFuncionario();
                break;
            case 3:
                funcao = LivroService.class.getMethod("listarLivrosDisponiveis", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, livroService, livros, false);
                System.out.print("Escreva o login do aluno: ");
                String nomeDoAluno = scanner.nextLine();
                boolean aluno = service.procurarAlunoPeloLogin(alunos, nomeDoAluno);
                if (!aluno) {
                    System.out.println("Aluno não encontrado na base de dados...");
                    retornoDoMenuFuncionario();
                    break;
                }
                System.out.print("Escreva o titulo do livro que deseja emprestar: ");
                nomeDoLivro = scanner.nextLine();
                livroService.emprestarLivro(livros, nomeDoLivro);
                retornoDoMenuFuncionario();
                break;
            case 4:
                System.out.print("Escreva o titulo do livro que deseja devolver: ");
                nomeDoLivro = scanner.nextLine();
                livroService.devolverLivro(livros, nomeDoLivro);
                retornoDoMenuFuncionario();
                break;
            case 5:
                System.out.println("Cadastrar livro");
                livros.add(service.cadastrarLivro());
                funcao = Menu.class.getMethod("menuDoFuncionario");
                menu.cadastroRealizadoComSucesso(menu, funcao);
                break;
            case 6:
                funcao = FuncionarioService.class.getMethod("listarLivros", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, service, livros, false);
                perguntaDeExclusao("livro");
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                if (nome.isEmpty()) {
                    menu.menuDoFuncionario();
                    break;
                }
                service.deletarLivro(livros, nome);
                retornoDoMenuFuncionario();
                break;
            case 7:
                break;
            default:
                menu.escolhaInvalida();
                menu.menuDoFuncionario();
                break;
        }
    }

    private void perguntaDeExclusao(String oQueExcluir) {
        System.out.println("Digite o " + oQueExcluir + " que deseja excluir do sistema, ou precione enter para voltar...");
    }

    private void retornoDoMenuFuncionario() throws Exception {
        menu.sleepClear();
        menu.menuDoFuncionario();
    }
}
