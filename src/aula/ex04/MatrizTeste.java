package aula.ex04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrizTeste {
    public static void main(String[] args) {
        int[][] matrizTeste = {{1, 2, 4}, {2, 1, 3}, {1, 8, 3}};

        Matriz matriz = new Matriz();
        matriz.compararArrays(matriz.getPrimeiraMatriz(), matriz.getSegundaMatriz());
        matriz.compararArrays(matriz.getPrimeiraMatriz(), matrizTeste);

        System.out.println();
        matriz.verificaSeMatrizPodeSerTransposta(matrizTeste);
        matriz.verificaSeMatrizPodeSerTransposta(matriz.getPrimeiraMatriz());

        System.out.println();
        int[][] matrizNula = matriz.gerarMatrizNula();
        System.out.println(matrizNula);

        System.out.println("\nMatriz copiada");
        int[][] copiaDeMatriz = matriz.gerarCopiaDeMatriz(matrizTeste);
        System.out.println(Arrays.deepToString(copiaDeMatriz));

    }
}
