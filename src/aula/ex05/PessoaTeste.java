package aula.ex05;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Amanda");
        pessoa.setSegundoNome("Pereira");
        pessoa.setSobrenome("Nascimento");

        pessoa.rubrica(pessoa.getPrimeiroNome(), pessoa.getSegundoNome(), pessoa.getSobrenome());
        pessoa.assinatura(pessoa.getPrimeiroNome(), pessoa.getSegundoNome(), pessoa.getSobrenome());
        System.out.println();

        pessoa.rubricaNomeCompleto("Jefferson Ricardo Mendonça");
        pessoa.assinaturaNomeCompleto("Jefferson Ricardo mendonça");
    }
}
