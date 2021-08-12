package escolhas;

import entidades.Aluno;
import entidades.Livro;
import servicos.LivroService;
import uteis.Menu;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

public class EscolhaAluno {
    Method funcao = null;
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);

    LivroService service = new LivroService();

    String nomeDoLivro;

    public void getEscolhaAluno(int escolhaAlunoSwitch, List<Aluno> alunos, List<Livro> livros) throws Exception {
        switch (escolhaAlunoSwitch) {
            case 1:
                funcao = LivroService.class.getMethod("listarTodosOsLivros", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, service, livros, true);
                menu.menuDoAluno();
                break;
            case 2:
                funcao = LivroService.class.getMethod("listarLivrosDisponiveis", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, service, livros, true);
                menu.menuDoAluno();
                break;
            case 3:
                funcao = LivroService.class.getMethod("listarLivrosDisponiveis", List.class);
                menu.listagemReflection("--- LIVROS ---", funcao, service, livros, false);
                System.out.print("Escreva o titulo do livro que deseja emprestar: ");
                nomeDoLivro = scanner.nextLine();
                service.emprestarLivro(livros, nomeDoLivro);
                menu.sleepClear();
                menu.menuDoAluno();
                break;
            case 4:
                System.out.print("Escreva o titulo do livro que deseja devolver: ");
                nomeDoLivro = scanner.nextLine();
                service.devolverLivro(livros, nomeDoLivro);
                menu.sleepClear();
                menu.menuDoAluno();
                break;
            case 5:
                break;
            default:
                menu.escolhaInvalida();
                menu.menuDoAluno();
                break;
        }
    }
}