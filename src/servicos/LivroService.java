package servicos;

import entidades.Livro;
import enums.Situacao;

import java.util.Date;
import java.util.List;

public class LivroService {

    public void listarTodosOsLivros(List<Livro> livros) {
        livros.stream().map(livro ->  "Titulo: " + livro.getTitulo() +
                                    "\nAutor: " + livro.getAutor() +
                                    "\nSituação: " + livro.getSituacao() +
                                    "\nData do emprestimo: " + livro.getDataEmprestimo() + "\n")
                .forEachOrdered(System.out::println);
    }

    public void listarLivrosDisponiveis(List<Livro> livros) {
        livros.stream().filter(livro -> livro.getSituacao().equals(Situacao.DISPONIVEL.getDescricao()))
                        .map(livro ->  "Titulo: " + livro.getTitulo() +
                                    "\nAutor: " + livro.getAutor() +
                                    "\nSituação: " + livro.getSituacao() + "\n")
                        .forEachOrdered(System.out::println);
    }

    public void emprestarLivro(List<Livro> livros, String nomeDoLivro) {
        livros.stream().filter(livro -> livro.getTitulo().equals(nomeDoLivro))
                .filter(livro -> livro.getSituacao().equals(Situacao.DISPONIVEL.getDescricao()))
                .findFirst()
                .map(livro -> {
                    livro.setSituacao(Situacao.EMPRESTADO);
                    livro.setDataEmprestimo(new Date());
                    System.out.println("LIVRO EMPRESTADO...");
                    return true;
                }).orElseGet(() -> {
                    System.out.println("Livro inexistente, ou não pode ser emprestado....");
                    return false;
                });
    }

    public void devolverLivro(List<Livro> livros, String nomeDoLivro) {
        livros.stream().filter(livro -> livro.getTitulo().equals(nomeDoLivro))
                .filter(livro -> livro.getSituacao().equals(Situacao.EMPRESTADO.getDescricao()))
                .findFirst()
                .map(livro -> {
                    livro.setSituacao(Situacao.DISPONIVEL);
                    livro.setDataEmprestimo(null);
                    livro.setDataDevolucao(new Date());
                    System.out.println("LIVRO DEVOLVIDO COM SUCESSO...");
                    return true;
                }).orElseGet(() -> {
                System.out.println("OOOOOPA, este livro não pertence a esta biblioteca....");
            return false;
        });
    }
}
