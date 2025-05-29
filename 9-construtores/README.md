# 🧱 Construtores em Java

Construtores são métodos especiais usados para inicializar objetos em Java. Eles são chamados automaticamente quando um novo objeto é criado usando a palavra-chave `new`.

## 📌 Características dos Construtores

- Possuem o **mesmo nome da classe**
- **Não possuem tipo de retorno**, nem `void`
- Podem ser **sobrecarregados** (vários construtores com diferentes parâmetros)

## 🔹 Construtor Padrão

Se você não declarar um construtor, o Java cria um construtor padrão sem parâmetros automaticamente.

```java
public class Pessoa {
    String nome;
    int idade;

    // Construtor padrão
    public Pessoa() {
        System.out.println("Objeto Pessoa criado.");
    }
}
```

## 🔹 Construtor com Parâmetros

Permite inicializar os atributos do objeto no momento da criação.

```java
public class Pessoa {
    String nome;
    int idade;

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

## 🔹 Usando o Construtor

```java
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ítalo", 25);
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
    }
}
```

## 🔹 Sobrecarga de Construtores

É possível criar múltiplos construtores com diferentes combinações de parâmetros.

```java
public class Produto {
    String nome;
    double preco;

    // Construtor padrão
    public Produto() {
        this.nome = "Sem nome";
        this.preco = 0.0;
    }

    // Construtor com parâmetros
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
```

## 🔹 Construtor Chamando Outro Construtor (this)

O `this()` pode ser usado para reaproveitar lógica entre construtores.

```java
public class Livro {
    String titulo;
    String autor;

    public Livro(String titulo) {
        this(titulo, "Desconhecido");
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
```

## 🚀 Como Executar os Exemplos

1. Clone este repositório:
   ```sh
   git clone https://github.com/italospina/Java-Basico/tree/main/9-construtores
   ```

2. Navegue até a pasta do projeto:
   ```sh
   cd java-construtores
   ```

3. Compile e execute os arquivos:
   ```sh
   javac Pessoa.java Main.java
   java Main
   ```

## 📚 Recursos Úteis

- [Construtores – Documentação Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)  
- [Tutorial W3Schools sobre Construtores](https://www.w3schools.com/java/java_constructors.asp)

## 📜 Licença

Este repositório está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Criado por [Italo Spina](https://github.com/italospina)
