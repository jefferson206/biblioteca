package escolhas;

import entidades.Administrador;
import entidades.Funcionario;
import uteis.Menu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

public class EscolhaAdmin {
    Menu menu = new Menu();
    Administrador administrador = new Administrador();

    public void getEscolhaAdmin(int escolhaAdminSwitch, Collection<Funcionario> funcionarios) throws Exception {
        switch (escolhaAdminSwitch) {
            case 1:
                System.out.println("Cadastrar funcionario");
                administrador.cadastrarFuncionario(funcionarios);
                Method funcao = Menu.class.getMethod("menuPrincipalDoAdministrador");
                menu.cadastroRealizadoComSucesso(menu, funcao);
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                menu.escolhaInvalida();
                break;
        }
    }
}