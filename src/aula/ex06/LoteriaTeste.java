package aula.ex06;

public class LoteriaTeste {
    public static void main(String[] args) {
        Loteria loteria = new Loteria();

        Loteria.IMPRIMIR_MEGASENA(loteria.getMegaSena());
        System.out.println();
        Loteria.IMPRIMIR_LOTOMANI(loteria.getLotoMania());
    }
}
