package aula.ex03;

public class SuperHeroiTeste {
    public static void main(String[] args) {
        Goku goku = new Goku("Goku", "Super Sayadin", "Japão", "Kimonu");
        goku.fraseBordao();
        goku.relogio();

        SuperMan superMan = new SuperMan("Clark Kent", "Visão de calor", "Brasil", "Cueca por cima da calça");
        System.out.println("Me chamo " + superMan.getNome());
        superMan.fraseBordao();
        superMan.relogio();

        HomemDeFerro homemDeFerro = new HomemDeFerro("Iron Man", "Armadura integrada", "Brasil", "Armadura de ferro");
        homemDeFerro.fraseBordao();
        homemDeFerro.relogio();
    }
}
