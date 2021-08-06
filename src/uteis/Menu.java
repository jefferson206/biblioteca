package uteis;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class Menu {
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
        System.out.println("| 4) Excluir Funcionário              |");
        System.out.println("| 5) Excluir aluno                    |");
        System.out.println("| 6) Excluir livro                    |");
        System.out.println("| 7) Voltar ao menu principal         |");
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

    public void cadastroRealizadoComSucesso(Object object, Method funcao) throws Exception {
        System.out.println("\nCadastro realizado com sucesso !!!");
        TimeUnit.SECONDS.sleep(2);
        limparTela();
        funcao.invoke(object);
    }

    public void limparTela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void escolhaInvalida() throws InterruptedException {
        System.out.println("\nOOOOOOOPS... houve algum engano !!!");
        TimeUnit.SECONDS.sleep(2);
        limparTela();
        menuPrincipal();
    }
}
