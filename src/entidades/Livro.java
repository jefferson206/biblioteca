package entidades;

import enums.Situacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private Situacao situacao;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private int anoPublicacao;

    public Livro() {
    }

    public Livro(String titulo, String autor, String editora, Situacao situacao, Date dataEmprestimo, Date dataDevolucao, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.situacao = situacao;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getSituacao() {
        return situacao.getDescricao();
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public String getDataEmprestimo() {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        return dataEmprestimo == null ? "" : dataFormatada.format(dataEmprestimo);
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        return dataDevolucao == null ? "" : dataFormatada.format(dataDevolucao);
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
