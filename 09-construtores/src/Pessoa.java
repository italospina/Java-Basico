/*
 * metodo construtor
 * - é um método especial que é chamado quando um objeto é criado
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String Endereco;

    public Pessoa(String cpf, String endereco) {
        this.cpf = cpf;
        this.Endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return cpf;
    }
    public String getEndereco() {
        return Endereco;
    }

    //setters de cpf e endereco nao podem ser publicos
    
}
