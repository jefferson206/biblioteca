package entidades.formularios;

import java.util.*;

public abstract class FormCadastroGeral {
    Scanner scanner = new Scanner(System.in);
    Map<String, Object> objectHashMap = new HashMap<>();

    public Map<String, Object> formularioCadastroPessoa() {
        System.out.print("Digite o nome completo: ");
        objectHashMap.put("nome", scanner.nextLine());
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

    public Map<String, Object> formularioCadastroLogin() {
        System.out.print("Login: ");
        objectHashMap.put("login", scanner.nextLine());
        System.out.print("Senha: ");
        objectHashMap.put("senha", scanner.nextLine());
        return objectHashMap;
    }

    public Map<String, Object> formularioCadastroAcervo() {
        return objectHashMap;
    }
}
