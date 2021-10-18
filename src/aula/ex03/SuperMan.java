package aula.ex03;

public class SuperMan extends SuperHeroi implements IBordao, IBrClock {

    public SuperMan() {
        super();
    }

    public SuperMan(String nome, String poder, String pais, String vestimento) {
        super(nome, poder, pais, vestimento);
    }

    @Override
    public void fraseBordao() {
        System.out.println("Para o alto e avante !!!");
    }
}
