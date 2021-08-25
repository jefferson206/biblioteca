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
                menu.menuDoAluno();
                break;
            case 2:
                funcao = LivroService.class.getMethod("listarLivrosDisponiveis", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, livroService, livros, true);
                menu.menuDoAluno();
                break;
            case 3:
                funcao = LivroService.class.getMethod("listarLivrosDisponiveis", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, livroService, livros, false);
                System.out.print("Escreva o titulo do livro que deseja emprestar: ");
                nomeDoLivro = scanner.nextLine();
                livroService.emprestarLivro(livros, nomeDoLivro);
                menu.sleepClear();
                menu.menuDoAluno();
                break;
            case 4:
                System.out.print("Escreva o titulo do livro que deseja devolver: ");
                nomeDoLivro = scanner.nextLine();
                livroService.devolverLivro(livros, nomeDoLivro);
                menu.sleepClear();
                menu.menuDoAluno();
                break;
            case 5:
                System.out.println("Cadastrar livro");
                livros.add(service.cadastrarLivro());
                funcao = Menu.class.getMethod("menuDoFuncionario");
                menu.cadastroRealizadoComSucesso(menu, funcao);
                service.cadastrarLivro();
                break;
            case 6:
                System.out.println("Deletar livro");
                break;
            default:
                menu.escolhaInvalida();
                menu.menuDoAluno();
                break;
        }
    }
}
