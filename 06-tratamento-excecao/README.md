
# 🛠️ Tratamento de Exceções em Java com Try-Catch
```md
O tratamento de exceções em Java é fundamental para lidar com erros inesperados e evitar que o programa pare abruptamente. O bloco `try-catch` permite capturar e tratar exceções de forma controlada.


## 📌 Estrutura Básica do Try-Catch

```java
try {
    // Código que pode gerar uma exceção
} catch (TipoDaExcecao e) {
    // Código para tratar a exceção
}
```

## 🔹 Exemplo Simples: Divisão por Zero

```java
public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso causará uma exceção
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}
```

## 🔹 Capturando Múltiplas Exceções

```java
public class ExemploMultiplasExcecoes {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Índice inválido
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
        } catch (Exception e) {
            System.out.println("Erro genérico: " + e.getMessage());
        }
    }
}
```

## 🔹 Uso do Finally
O bloco `finally` é opcional e sempre será executado, independentemente de ocorrer uma exceção.

```java
public class ExemploFinally {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // Gera NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Erro: Não é possível converter para número.");
        } finally {
            System.out.println("Bloco finally sempre executado.");
        }
    }
}
```

## 🔹 Lançando Exceções com `throw`

```java
public class ExemploThrow {
    public static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade mínima é 18 anos.");
        }
        System.out.println("Acesso permitido!");
    }
    
    public static void main(String[] args) {
        try {
            verificarIdade(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
```

## 🔹 Exceções `Exception` e `RuntimeException`

Em Java, as exceções podem ser verificadas (`checked exceptions`) ou não verificadas (`unchecked exceptions`).

### Exception (Checked Exception)
Exceções verificadas são aquelas que devem ser tratadas obrigatoriamente com `try-catch` ou declaradas com `throws`.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploCheckedException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("arquivo.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado.");
        }
    }
}
```

### RuntimeException (Unchecked Exception)
Exceções não verificadas ocorrem em tempo de execução e não exigem tratamento obrigatório.

```java
public class ExemploUncheckedException {
    public static void main(String[] args) {
        String texto = null;
        try {
            System.out.println(texto.length()); // Gera NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar um objeto nulo.");
        }
    }
}
```

## 🚀 Como Executar os Exemplos

1. Clone este repositório:
   ```sh
   git clone https://github.com/italospina/Java-Basico/tree/main/6-tratamento-excecao
   ```
2. Navegue até a pasta do projeto:
   ```sh
   cd java-try-catch
   ```
3. Compile e execute um dos arquivos Java:
   ```sh
   javac ExemploTryCatch.java
   java ExemploTryCatch
   ```

## 📚 Recursos Úteis

- [Documentação Oficial do Java](https://docs.oracle.com/en/java/)
- [Java Tutorials](https://www.w3schools.com/java/)


## 📜 Licença

Este repositório está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---
Criado por [Italo Spina](https://github.com/italospina).
