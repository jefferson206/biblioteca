package aula.ex01;

public class Circulo extends FormaGeometrica implements IFormaGeometrica {
    private double area, raio;

    public Circulo() {
        super();
    }

    public Circulo(double area, double raio) {
        super();
        this.area = area;
        this.raio = raio;
    }

    public Circulo(String som, double area, double raio) {
        super(som);
        this.area = area;
        this.raio = raio;
    }

    private double getArea() {
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        setArea(Math.PI * Math.pow(getRaio(), 2));
        return getArea();
    }

    @Override
    public void emitirSom() {
        setSom("Round, Round, Round");
        System.out.println(getSom());
    }
}

