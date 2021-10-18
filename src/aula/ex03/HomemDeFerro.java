package aula.ex03;

public class HomemDeFerro extends SuperHeroi implements IBordao, IBrClock {

    public HomemDeFerro() {
        super();
    }

    public HomemDeFerro(String nome, String poder, String pais, String vestimento) {
        super(nome, poder, pais, vestimento);
    }

    @Override
    public void fraseBordao() {
        System.out.println("Eu sou o " + getNome() + " !!!");
    }
}
