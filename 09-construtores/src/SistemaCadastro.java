public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("123.456.789-00", "Rua Exemplo, 123");
        pessoa.setNome("João da Silva");
        // pessoa.setCPF("123.456.789-00"); // Não permitido
        // pessoa.setEndereco("Rua Exemplo, 123"); // Não permitido

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCPF());
        System.out.println("Endereço: " + pessoa.getEndereco());
    }
}
