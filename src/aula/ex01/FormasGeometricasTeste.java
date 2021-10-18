package aula.ex01;

public class FormasGeometricasTeste {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(17);
        System.out.println("O valor da área é de: " + quadrado.calcularArea());
        System.out.println("O valor do perimetro é de: " + quadrado.calcularPerimetro());
        System.out.print("E o quadrado faz: ");
        quadrado.emitirSom();

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5);
        retangulo.setLargura(15);
        System.out.println("\nO valor da área é de: " + retangulo.calcularArea());
        System.out.println("O valor do perimetro é de: " + retangulo.calcularPerimetro());
        System.out.print("E o retangulo faz: ");
        retangulo.emitirSom();

        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        System.out.println("\nO valor da área é de: " + circulo.calcularArea());
        System.out.print("E o circulo faz: ");
        circulo.emitirSom();
    }
}
