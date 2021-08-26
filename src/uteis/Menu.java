package uteis;

import javax.swing.*;
import java.awt.*;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class Menu extends JPanel {
    public void menuPrincipal() {
        System.out.println("--------- B I B L I O T E C A ---------");
        System.out.println("| 1) ADMIN                            |");
        System.out.println("| 2) FUNCIONARIO                      |");
        System.out.println("| 3) ALUNO                            |");
        System.out.println("| 4) SAIR                             |");
        System.out.println("---------------------------------------");
        System.out.print("Opção: ");
    }

    public void menuPrincipalDoAdministrador() {
        System.out.println("-------------- A D M I N --------------");
        System.out.println("| 1) Cadastrar funcionário            |");
        System.out.println("| 2) Cadastrar aluno                  |");
        System.out.println("| 3) Cadastrar livro                  |");
        System.out.println("| 4) Listar Funcionários              |");
        System.out.println("| 5) Listar alunos                    |");
        System.out.println("| 6) Listar acervo                    |");
        System.out.println("| 7) Excluir Funcionário              |");
        System.out.println("| 8) Excluir aluno                    |");
        System.out.println("| 9) Excluir livro                    |");
        System.out.println("| 10) Voltar ao menu principal        |");
        System.out.println("---------------------------------------");
        System.out.print("Opção: ");
    }

    public void menuDoFuncionario() {
        System.out.println("-------- F U N C I O N Á R I O --------");
        System.out.println("| 1) Listar todos os livros           |");
        System.out.println("| 2) Listar livros disponíveis        |");
        System.out.println("| 3) Fazer emprestimo do Livro        |");
        System.out.println("| 4) Devolver Livro                   |");
        System.out.println("| 5) Cadastrar Livro                  |");
        System.out.println("| 6) Deletar Livro                    |");
        System.out.println("| 7) voltar ao menu principal         |");
        System.out.println("---------------------------------------");
        System.out.print("Opção: ");
    }

    public void menuDoAluno() {
        System.out.println("-------------- A L U N O --------------");
        System.out.println("| 1) Checar todos os livros           |");
        System.out.println("| 2) Checar livros disponiveis        |");
        System.out.println("| 3) Fazer emprestimo do livro        |");
        System.out.println("| 4) Devolver livro                   |");
        System.out.println("| 5) voltar ao menu principal         |");
        System.out.println("---------------------------------------");
        System.out.print("Opção: ");
    }

    public void acessoNegado() {
        System.out.println("***********************************");
        System.out.println("*                                 *");
        System.out.println("*          ACESSO NEGADO          *");
        System.out.println("*                                 *");
        System.out.println("***********************************");
    }

    public void acessoPermitido() {
        System.out.println("***********************************");
        System.out.println("*                                 *");
        System.out.println("*         ACESSO PERMITIDO        *");
        System.out.println("*                                 *");
        System.out.println("***********************************");
    }

    public void listagemReflection(String titulo, Method funcao, Object instancia, Object argumento, Boolean clear) throws Exception {
        System.out.println("---------" + titulo + "-----------");
        funcao.invoke(instancia, argumento);
        System.out.println("----------------------------------");
        TimeUnit.SECONDS.sleep(2);
        if (clear) limparTela();
    }

    public void cadastroRealizadoComSucesso(Object object, Method funcao) throws Exception {
        System.out.println("\nCadastro realizado com sucesso !!!");
        sleepClear();
        funcao.invoke(object);
    }

    public void limparTela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void escolhaInvalida() throws Exception {
        System.out.println("\nOOOOOOOPS... houve algum engano !!!");
        sleepClear();
    }

    public void sleepClear() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        limparTela();
    }

    public void erroDeInputDoMenu(Object object, Method funcao) throws Exception {
        System.out.println("Menu só aceita numeros inteiro");
        sleepClear();
        funcao.invoke(object);
    }

    public void easterEgg() {
        JFrame frame = new JFrame("Sorria");
        frame.setSize(500,500);
        frame.setBackground(Color.white);
        Menu panel = new Menu();
        frame.add (panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.yellow);
        grafico.drawArc(100,100,250,250,0,360);
        grafico.fillArc(100,100,250,250,0,360);
        grafico.setColor(Color.black);
        grafico.drawArc(170,185,25,25,0,360);
        grafico.fillArc(170,185,25,25,0,360);
        grafico.drawArc(255,185,25,25,0,360);
        grafico.fillArc(255,185,25,25,0,360);
        grafico.drawArc(150,215,150,100,0,-180);
    }
}
