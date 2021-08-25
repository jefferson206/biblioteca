package servicos;

import entidades.Livro;
import entidades.formularios.FormCadastroAdmin;
import enums.Situacao;

import java.util.List;
import java.util.Map;

public interface ServicosGerais {
    Livro livro = new Livro();
    FormCadastroAdmin formCadastro = new FormCadastroAdmin();

    default Livro cadastrarLivro() {
        Map<String, Object> objectMap = formCadastro.formularioCadastroLivro();
        livro.setTitulo((String) objectMap.get("titulo"));
        livro.setAutor((String) objectMap.get("autor"));
        livro.setAnoPublicacao((Integer) objectMap.get("anoPublicacao"));
        livro.setEditora((String) objectMap.get("editora"));
        livro.setDataDevolucao(null);
        livro.setDataEmprestimo(null);
        livro.setSituacao(Situacao.DISPONIVEL);
        return livro;
    }

    default void deletarLivro(List<Livro> livros, String titulo) {
        int tamanhoInicial = livros.size();
        livros.removeIf(livro -> titulo.equals(livro.getTitulo()));
        if (tamanhoInicial == livros.size()) cadastroInexistente();
        else sucesso();
    }

    default void listarLivros(List<Livro> livros) {
        livros.stream().map(livro ->  "Titulo: " + livro.getTitulo() +
                "\nAutor: " + livro.getAutor() +
                "\nSituação: " + livro.getSituacao() +
                "\nData do emprestimo: " + livro.getDataEmprestimo() + "\n")
                .forEachOrdered(System.out::println);
    }

    default void cadastroInexistente() {
        System.out.println("OOOOOPS... Cadastro inexistente");
    }

    default void sucesso() {
        System.out.println("S U C E S S O . . . . . ");
    }
}
