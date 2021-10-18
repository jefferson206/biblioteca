package aula.ex05;

public class Pessoa {
    private String primeiroNome;
    private String segundoNome;
    private String sobrenome;
    private String nomeCompleto;

    public Pessoa() {
    }

    public Pessoa(String primeiroNome, String segundoNome, String sobrenome, String nomeCompleto) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.sobrenome = sobrenome;
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void rubrica(String primeiroNome, String segundoNome, String sobrenome) {
        String iniciaisDoNome = String.valueOf(primeiroNome.charAt(0)) +
                segundoNome.charAt(0) +
                sobrenome.charAt(0);
        System.out.println("Rubrica: " + iniciaisDoNome.toLowerCase());
    }

    public void assinatura(String primeiroNome, String segundoNome, String sobrenome) {
        String rubrica = primeiroNome.toUpperCase().charAt(0) + "." +
                segundoNome.toUpperCase().charAt(0) + "." +
                sobrenome.substring(0, 1).toUpperCase().concat(sobrenome.substring(1));
        System.out.println("Assinatura: " + rubrica);
    }

    public void rubricaNomeCompleto(String nomeCompleto) {
        String[] auxiliar = nomeCompleto.split(" ");
        StringBuilder rubrica = new StringBuilder();
        for (String aux: auxiliar) {
            rubrica.append(aux.charAt(0));
        }
        System.out.println("Rubrica: " + rubrica.toString().toLowerCase());
    }

    public void assinaturaNomeCompleto(String nomeCompleto) {
        String[] nomeAuxiliar = nomeCompleto.split(" ");
        StringBuilder rubrica = new StringBuilder();
        for(int aux = 0; aux < nomeAuxiliar.length -1; aux++) {
            rubrica.append(nomeAuxiliar[aux].toUpperCase().charAt(0)).append(".");
        }
        rubrica.append(trataPalavraParaDeixarPrimeiraLetraMaiuscula(nomeAuxiliar));
        System.out.println("Assinatura: " + rubrica);
    }

    private String trataPalavraParaDeixarPrimeiraLetraMaiuscula(String[] palavra) {
        return palavra[palavra.length-1].substring(0,1).toUpperCase().concat(palavra[palavra.length-1].substring(1));
    }

}
