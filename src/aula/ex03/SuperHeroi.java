package aula.ex03;

public class SuperHeroi {
    private String nome;
    private String poder;
    private String pais;
    private String vestimento;

    public SuperHeroi() {
    }

    public SuperHeroi(String nome, String poder, String pais, String vestimento) {
        this.nome = nome;
        this.poder = poder;
        this.pais = pais;
        this.vestimento = vestimento;
    }

    public String getVestimento() {
        return vestimento;
    }

    public void setVestimento(String vestimento) {
        this.vestimento = vestimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
