package aula;

public class Movie {
    private String titulo;
    private String genero;
    private int rating;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void iniciarFilme() {
        System.out.println("tocando o filme " + titulo);
    }
}

class MovieTeste {
    public static void main(String[] args) {
        Movie primeiroFilme = new Movie();
        primeiroFilme.setTitulo("Las venturas");
        primeiroFilme.setGenero("Aventura");
        primeiroFilme.setRating(9);

        Movie segundo = new Movie();
        segundo.setTitulo("DIE HARD");
        segundo.setGenero("Ação");
        segundo.setRating(10);

        Movie terceiro = new Movie();
        terceiro.setTitulo("Coco a vida é uma festa");
        terceiro.setGenero("Comedia");
        terceiro.setRating(9);

        primeiroFilme.iniciarFilme();
        segundo.iniciarFilme();
        terceiro.iniciarFilme();

    }
}
