package interfaces;

public interface ICadastro<T> {
    void cadastrarPessoa(T entidade);
    void cadastrarEndereco(T entidade);
    void cadastrarAcervo(T entidade);
}
