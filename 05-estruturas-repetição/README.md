# Estruturas de Repetição em Java

Este repositório contém exemplos práticos das principais estruturas de repetição em Java, demonstrando o funcionamento de `for`, `while`, `do-while` e `foreach`.

## 📌 Estruturas Implementadas

1. **For** - Laço de repetição com contador.
2. **While** - Laço de repetição baseado em condição.
3. **Do-While** - Executa pelo menos uma vez antes de verificar a condição.
4. **Foreach** - Usado para percorrer arrays e coleções.
5. **If-Else** - Estrutura condicional para tomada de decisão.

## 📂 Estrutura do Repositório

```
Java-Basico/
├── 5-estruturas-repetição/
│   ├── src/
│   │   ├── ExemploForBreakContinue.java
│   │   ├── ExemploElseIf.java
│   │   ├── ExemploFor.java
│   │   ├── ExemplosForArray.java
│   │   ├── ExemploSwitchCase.java
│   │   ├── ExemploTernario.java 
│   │   ├── ExemploWhile.java 
│   │   ├── ExemploDoWhile
│   ├── README.md
```

## 🚀 Executando os Exemplos

1. Clone o repositório:
   ```sh
   git clone https://github.com/italospina/Java-Basico.git
   ```
2. Navegue até a pasta das estruturas de repetição:
   ```sh
   cd Java-Basico/5-estruturas-repetição/src
   ```
3. Compile e execute um exemplo, por exemplo:
   ```sh
   javac ForExample.java
   java ForExample
   ```

## 📖 Exemplos de Código

### For
```java
public class ExemploFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador: " + i);
        }
    }
}
```

### For Com Array
```java
public class ExemplosForArray {
    public static void main(String[] args) {
        String[] nomes = {"Alice", "Bob", "Carlos"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
        }
    }
}
```

### Switch Case
```java
public class ExemploSwitchCase {
    public static void main(String[] args) {
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
```

### Ternario
```java
public class ExemploTernario {
    public static void main(String[] args) {
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número é: " + resultado);
    }
}
```
### While
```java
public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
```

### Do While
```java
public class ExemploDoWhile {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);
    }
}
```

### Foreach Loop
```java
int[] numeros = {10, 20, 30, 40, 50};
for (int numero : numeros) {
    System.out.println("Número: " + numero);
}
```

### If-Else
```java
int valor = 10;
if (valor > 5) {
    System.out.println("O valor é maior que 5.");
} else {
    System.out.println("O valor é menor ou igual a 5.");
}
```

## 📜 Licença

Este repositório está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---
Criado por [Italo Spina](https://github.com/italospina).

