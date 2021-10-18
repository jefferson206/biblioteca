package aula.ex01;

public class Retangulo extends FormaGeometrica implements IFormaGeometrica, IPerimetro {
    private double area, perimetro, altura, largura;

    public Retangulo() {
        super();
    }

    public Retangulo(double area, double perimetro, double altura, double largura) {
        this.area = area;
        this.perimetro = perimetro;
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo(String som, double area, double perimetro, double altura, double largura) {
        super(som);
        this.area = area;
        this.perimetro = perimetro;
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    private double getArea() {
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private double getPerimetro() {
        return perimetro;
    }

    private void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public double calcularArea() {
        setArea(getAltura()*getLargura());
        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        setPerimetro((getAltura()*2) + (getLargura()*2));
        return getPerimetro();
    }

    @Override
    public void emitirSom() {
        setSom("Slaft, Slaft, Slaft");
        System.out.println(getSom());
    }
}
