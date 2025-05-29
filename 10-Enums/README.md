# 🔢 Enums em Java

Enums (ou enumerações) em Java são tipos especiais de classe que representam um conjunto fixo de constantes. Eles são ideais para valores que não mudam, como dias da semana, estados de um pedido, ou níveis de acesso.

## 📌 Vantagens dos Enums

- Melhor legibilidade e organização do código
- Substituem o uso de constantes `final static`
- Garantem segurança de tipo (type safety)
- Permitem adicionar atributos e métodos

## 🔹 Criando um Enum Simples

```java
public enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}
```

## 🔹 Utilizando o Enum

```java
public class Agenda {
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.SEXTA;

        if (hoje == DiaDaSemana.SEXTA) {
            System.out.println("Sextou!");
        } else {
            System.out.println("Ainda não é sexta.");
        }
    }
}
```

## 🔹 Enum com Construtor e Atributos

Enums podem ter atributos e métodos, como se fossem classes.

```java
public enum StatusPedido {
    PENDENTE("Pendente"),
    PROCESSANDO("Processando"),
    ENVIADO("Enviado"),
    ENTREGUE("Entregue");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
```

### Exemplo de uso:

```java
public class Pedido {
    public static void main(String[] args) {
        StatusPedido status = StatusPedido.ENVIADO;

        System.out.println("Status atual: " + status);
        System.out.println("Descrição: " + status.getDescricao());
    }
}
```

## 🔹 Iterando sobre os Valores do Enum

```java
public class TesteEnum {
    public static void main(String[] args) {
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }
    }
}
```

## 🚀 Como Executar os Exemplos

1. Clone este repositório:
   ```sh
   git clone https://github.com/italospina/Java-Basico/tree/main/10-enums
   ```

2. Navegue até a pasta do projeto:
   ```sh
   cd java-enums
   ```

3. Compile e execute os arquivos:
   ```sh
   javac DiaDaSemana.java Agenda.java
   java Agenda
   ```

## 📚 Recursos Úteis

- [Documentação Oficial - Enum Types](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)  
- [Tutorial W3Schools sobre Enums](https://www.w3schools.com/java/java_enums.asp)

## 📜 Licença

Este repositório está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Criado por [Italo Spina](https://github.com/italospina)
