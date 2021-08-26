package excecoes;

import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExcecoes {
    public int validaTipoInteiro(Scanner scanner, Object object, Method funcao) throws Exception {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                funcao.invoke(object);
            }
        }
    }
}
