package aula.ex04;

import java.util.Arrays;

public class Matriz {
    private int[][] primeiraMatriz = {{0, 1, 2},
                                      {1, 2, 0},
                                      {2, 0, 1}};

    private int[][] segundaMatriz = {{0, 1, 2},
                                     {1, 2, 0},
                                     {2, 0, 1}};

    public Matriz() {
    }

    public Matriz(int[][] primeiraMatriz, int[][] segundaMatriz) {
        this.primeiraMatriz = primeiraMatriz;
        this.segundaMatriz = segundaMatriz;
    }

    public int[][] getPrimeiraMatriz() {
        return primeiraMatriz;
    }

    public void setPrimeiraMatriz(int[][] primeiraMatriz) {
        this.primeiraMatriz = primeiraMatriz;
    }

    public int[][] getSegundaMatriz() {
        return segundaMatriz;
    }

    public void setSegundaMatriz(int[][] segundaMatriz) {
        this.segundaMatriz = segundaMatriz;
    }

    public void compararArrays(int[][] matriz1, int[][] matriz2) {
        if (Arrays.deepEquals(matriz1, matriz2)) {
            System.out.println("Matrizes são iguais !!!");
        } else {
            System.out.println("Matrizes são diferentes !!!");
        }
    }


    public void verificaSeMatrizPodeSerTransposta(int[][] matriz) {
        boolean transporta = transportaMatriz(matriz);
        if (transporta) {
            System.out.println("Matriz pode ser transposta !!!");
        } else {
            System.out.println("Matriz não pode ser transposta .... ");
        }
    }

    public int[][] gerarMatrizNula() {
        int[][] matrizNula = null;
        try {
            System.out.println(matrizNula[0][0]);
        } catch (Exception exception) {
            System.out.println("Matriz nula: " + matrizNula);
        }
        return matrizNula;
    }

    public int[][] gerarCopiaDeMatriz(int[][] matrizTemplate) {
        return Arrays.copyOf(matrizTemplate, matrizTemplate.length);
    }

    private boolean transportaMatriz(int[][] matriz) {
        int tamanhoMatriz = matriz.length;
        for (int linha = 0; linha < tamanhoMatriz; linha++) {
            for (int coluna = 0; coluna < tamanhoMatriz; coluna++) {
                if ((matriz[linha][coluna]) != (matriz[coluna][linha])) {
                    return false;
                }
            }
        }
        return true;
    }
}
