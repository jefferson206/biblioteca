package aula.ex03;

public class Goku extends SuperHeroi implements IBordao, IPjClock {

    public Goku() {
        super();
    }

    public Goku(String nome, String poder, String pais, String vestimento) {
        super(nome, poder, pais, vestimento);
    }

    @Override
    public void fraseBordao() {
        System.out.println("Oiii eu sou o " + getNome() + " !!!");
    }
}
