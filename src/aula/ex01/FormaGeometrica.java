package aula.ex01;

public class FormaGeometrica {
    private String som;

    public FormaGeometrica() {
    }

    public FormaGeometrica(String som) {
        this.som = som;
    }

    protected String getSom() {
        return som;
    }

    protected void setSom(String som) {
        this.som = som;
    }
}
