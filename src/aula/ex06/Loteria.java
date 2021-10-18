package aula.ex06;

import java.util.Arrays;

public class Loteria {
    int[][] megaSena = new int[6][10];
    int[][] lotoMania = new int[10][10];

    public Loteria() {
        criaMegaSenaDefault();
        criaLotomaniaDefault();
    }

    public int[][] getMegaSena() {
        return megaSena;
    }

    public int[][] getLotoMania() {
        return lotoMania;
    }

    private void setLotoMania(int[][] lotoMania) {
        this.lotoMania = lotoMania;
    }

    private void setMegaSena(int[][] megaSena) {
        this.megaSena = megaSena;
    }

    private void criaMegaSenaDefault() {
        int[][] megaSena = new int[6][10];
        int valor = 1;
        for (int i =0; i<6 ; i++) {
            for (int j = 0; j<10; j++) {
                megaSena[i][j] = valor++;
            }
        }
        setMegaSena(megaSena);
    }

    private void criaLotomaniaDefault() {
        int[][] loto = new int[10][10];
        int valor = 1;
        for (int i =0; i<10 ; i++) {
            for (int j = 0; j<10; j++) {
                loto[i][j] = valor++;
            }
        }
        setLotoMania(loto);
    }

    public static void IMPRIMIR_MEGASENA(int[][] mega) {
        System.out.println("Mega-sena: ");
        for (int[] ints : mega) System.out.println(Arrays.toString(ints).replace(",", " "));
    }

    public static void IMPRIMIR_LOTOMANI(int[][] loto) {
        System.out.println("Loto-mania: ");
        for (int[] ints : loto) System.out.println(Arrays.toString(ints).replace(",", " "));
    }
}
