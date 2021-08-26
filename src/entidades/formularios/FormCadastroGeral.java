package entidades.formularios;

import excecoes.TratamentoDeExcecoes;

import java.lang.reflect.Method;
import java.util.*;

public abstract class FormCadastroGeral {
    Scanner scanner = new Scanner(System.in);
    Map<String, Object> objectHashMap = new HashMap<>();
    TratamentoDeExcecoes excecoes = new TratamentoDeExcecoes();

    public Map<String, Object> formularioCadastroPessoa() {
        System.out.print("Digite o nome completo: ");
        String nome = scanner.nextLine();
        if (nome.isEmpty()) nome = scanner.nextLine();
        objectHashMap.put("nome", nome);
        System.out.print("Data de nascimento: ");
        objectHashMap.put("dataNascimento", scanner.nextLine());
        System.out.print("CPF: ");
        objectHashMap.put("cpf", scanner.nextLine());
        System.out.print("Telefone: ");
        objectHashMap.put("telefone", scanner.nextLine());
        return objectHashMap;
    }

    public Map<String, Object> formularioCadastroEndereco() {
        System.out.print("Logradouro: ");
        objectHashMap.put("logradouro", scanner.nextLine());
        System.out.print("Endereco: ");
        objectHashMap.put("endereco", scanner.nextLine());
        System.out.print("Numero: ");
        objectHashMap.put("numero", scanner.nextLine());
        System.out.print("CEP: ");
        objectHashMap.put("cep", scanner.nextLine());
        System.out.print("Bairro: ");
        objectHashMap.put("bairro", scanner.nextLine());
        return objectHashMap;
    }

    public Map<String, Object> formularioCadastroLogin() throws Exception {
        FormCadastroGeral formCadastroGeral = new FormCadastroGeral() {};
        System.out.print("Login: ");
        objectHashMap.put("login", scanner.nextLine());
        printSenha();
        Method funcao = FormCadastroGeral.class.getMethod("mensagemTipoInvalidoDaSenha");
        int senha = excecoes.validaTipoInteiro(scanner, formCadastroGeral, funcao);
        objectHashMap.put("senha", senha);
        return objectHashMap;
    }

    public Map<String, Object> formularioCadastroLivro() throws Exception {
        FormCadastroGeral formCadastroGeral = new FormCadastroGeral() {};
        System.out.print("Titulo: ");
        String nome = scanner.nextLine();
        if (nome.isEmpty()) nome = scanner.nextLine();
        objectHashMap.put("titulo", nome);
        System.out.print("Autor: ");
        objectHashMap.put("autor", scanner.nextLine());
        System.out.print("Editora: ");
        objectHashMap.put("editora", scanner.nextLine());
        printAnoPublicacao();
        Method funcao = FormCadastroGeral.class.getMethod("mensagemTipoInvalidoDoAnoDePublicacao");
        int anoPublicacao = excecoes.validaTipoInteiro(scanner, formCadastroGeral, funcao);
        objectHashMap.put("anoPublicacao", anoPublicacao);
        return objectHashMap;
    }

    public void mensagemTipoInvalidoDoAnoDePublicacao() {
        System.out.println("Ano de publicação deve ser somente números");
        printAnoPublicacao();
    }

    public void mensagemTipoInvalidoDaSenha() {
        System.out.println("Senha deve ser somente números");
        printSenha();
    }

    public void printAnoPublicacao() {
        System.out.print("Ano de publicação: ");
    }

    public void printSenha() {
        System.out.print("Senha: ");
    }
}
