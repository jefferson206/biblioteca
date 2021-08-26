import entidades.Aluno;
import entidades.Funcionario;
import entidades.Livro;
import escolhas.EscolhaPrincipal;
import uteis.Menu;

import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        EscolhaPrincipal escolhaPrincipal = new EscolhaPrincipal();
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();
        Menu menu = new Menu();

        Setup setup = new Setup();
        setup.setupFuncionario(funcionarios);
        setup.setupAluno(alunos);
        setup.setupLivro(livros);

        int escolha;

        menu.menuPrincipal();

        do {
            while (!scanner.hasNextInt()) {
                Method funcao = Menu.class.getMethod("menuPrincipal");
                menu.erroDeInputDoMenu(menu, funcao);
                scanner.next();
            }
            escolha = scanner.nextInt();
            escolhaPrincipal.getEscolhaPrincipal(escolha, funcionarios, alunos, livros);
        } while (escolha != 4);
    }
}
