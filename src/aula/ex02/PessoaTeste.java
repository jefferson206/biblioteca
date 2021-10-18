package aula.ex02;

public class PessoaTeste {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jefferson");
        pessoa.setAltura(176);
        pessoa.setDataDeNascimento("04/02/1990");
        pessoa.imprimirDados();
    }
}
