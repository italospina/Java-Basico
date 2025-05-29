# 🔄 Getters e Setters em Java

Os métodos *getter* e *setter* são essenciais na programação orientada a objetos em Java. Eles permitem acessar e modificar atributos privados de uma classe, mantendo o princípio do encapsulamento.

## 📌 O Que São Getters e Setters?

- **Getter**: método que retorna o valor de um atributo.  
- **Setter**: método que define (altera) o valor de um atributo.

Esses métodos são utilizados para proteger os campos internos da classe contra acessos diretos e garantir controle sobre como os dados são manipulados.

## 🔹 Exemplo Básico

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

## 🔹 Utilizando Getters e Setters

```java
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ítalo");
        pessoa.setIdade(25);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
```

## 🔹 Vantagens do Uso

✅ Encapsulamento dos dados  
✅ Validação antes da atribuição de valores  
✅ Flexibilidade para alterar a implementação interna sem impactar quem usa a classe

## 🔹 Exemplo com Validação no Setter

```java
public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }
}
```

## 🚀 Como Executar os Exemplos

1. Clone este repositório:
   ```sh
   git clone https://github.com/italospina/Java-Basico/tree/main/8-getter-setter
   ```

2. Navegue até a pasta do projeto:
   ```sh
   cd java-get-set
   ```

3. Compile e execute os arquivos:
   ```sh
   javac Pessoa.java Main.java
   java Main
   ```

## 📚 Recursos Úteis

- [Encapsulamento em Java – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/encapsulation.html)  
- [Getters e Setters – W3Schools](https://www.w3schools.com/java/java_encapsulation.asp)

## 📜 Licença

Este repositório está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Criado por [Italo Spina](https://github.com/italospina)
