package enums;

public enum Situacao {
    DISPONIVEL("Disponível"),
    EMPRESTADO("Emprestado");

    Situacao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;
    public String getDescricao() {
        return descricao;
    }
}
