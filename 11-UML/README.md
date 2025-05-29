# 🧩 UML com Java – Entendendo a Modelagem de Classes

UML (Unified Modeling Language) é uma linguagem padrão para modelar sistemas orientados a objetos. Com ela, é possível visualizar a estrutura e o comportamento de sistemas antes mesmo de escrever o código.

## 📌 O Que é um Diagrama de Classes?

O diagrama de classes é um dos principais diagramas da UML. Ele mostra as **classes**, seus **atributos**, **métodos** e os **relacionamentos** entre elas, como herança, associação e composição.

## 🔹 Notação Básica de UML

```
+ público
- privado
# protegido

Exemplo de classe em UML:

+--------------------+
|     Pessoa         |
+--------------------+
| - nome: String     |
| - idade: int       |
+--------------------+
| +getNome(): String |
| +setNome(String)   |
+--------------------+
```

## 🔹 Representação Java dessa Classe

```java
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

## 🔹 Relacionamentos em UML

### 🔸 Associação
Uma classe se relaciona com outra.

```java
public class Carro {
    private Motor motor;
}
```

UML:
```
Carro --------> Motor
```

### 🔸 Agregação (tem, mas pode viver sem)
```java
public class Departamento {
    private List<Funcionario> funcionarios;
}
```

UML:
```
Departamento o------ Funcionario
```

### 🔸 Composição (parte obrigatória)
```java
public class Casa {
    private Quarto quarto = new Quarto();
}
```

UML:
```
Casa ◆------ Quarto
```

### 🔸 Herança
```java
public class Funcionario extends Pessoa {
}
```

UML:
```
Pessoa
  ▲
  |
Funcionario
```

## 🛠️ Ferramentas para Criar Diagramas UML

- [draw.io (gratuito)](https://app.diagrams.net)
- [Lucidchart](https://www.lucidchart.com)
- [StarUML](http://staruml.io)
- [PlantUML](https://plantuml.com) – baseado em texto

## 🚀 Como Utilizar no Projeto

1. Modele suas classes usando UML antes de codificar.
2. Identifique os relacionamentos entre as entidades.
3. Use a modelagem como base para implementar as classes em Java.

## 📚 Recursos Úteis

- [Documentação Oficial UML](https://www.uml.org/)
- [Tutorial de UML – Visual Paradigm](https://www.visual-paradigm.com/tutorials/uml-diagram-tutorial/)
- [PlantUML Examples](https://plantuml.com/)

## 📜 Licença

Este repositório está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Criado por [Italo Spina](https://github.com/italospina)
