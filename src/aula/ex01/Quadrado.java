package aula;

public class Quadrado extends FormaGeometrica implements IFormaGeometrica, IPerimetro {
    private double area, perimetro, lado;

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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        setArea(getLado()*getLado());
        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        setPerimetro(getLado()*4);
        return getPerimetro();
    }

    @Override
    public void emitirSom() {
        setSom("Plock, Plock, Plock");
        System.out.println(getSom());
    }
}


