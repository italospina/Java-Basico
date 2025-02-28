# Visibilidade de Recursos em Java

Este repositório contém exemplos práticos sobre os diferentes níveis de visibilidade de recursos (métodos e atributos) em Java. O objetivo é demonstrar como a visibilidade impacta o acesso a funcionalidades dentro de uma aplicação.

## 📌 Níveis de Visibilidade

Em Java, os métodos e atributos podem ter diferentes modificadores de acesso, que definem onde e como eles podem ser acessados. A seguir, apresentamos os principais modificadores utilizados no projeto:

### 🔒 Private
- Métodos e atributos marcados como `private` só podem ser acessados dentro da própria classe.
- Exemplo: Métodos internos dos funcionários que não devem ser acessados por outras classes.

```java
private void lavarIngredientes() {
    System.out.println("Ingredientes lavados");
}
```

### 🌍 Default (Pacote)
- Quando nenhum modificador de acesso é especificado, o recurso tem visibilidade de **pacote**.
- Isso significa que ele só pode ser acessado por classes dentro do mesmo **pacote**.
- Exemplo: Métodos como `trocarGas()` que só devem ser acessíveis dentro do pacote de atendimento.

```java
void trocarGas() {
    System.out.println("Atendente trocando gás");
}
```

### 🔓 Public
- Métodos e atributos `public` podem ser acessados de qualquer lugar do código.
- Exemplo: Métodos que representam ações visíveis na aplicação, como fazer pedidos e servir mesas.

```java
public void anotarPedido() {
    System.out.println("Atendente anotando pedido");
}
```

## 📂 Estrutura do Projeto

```
7-visibilidade-recursos/
│── lanchonete/
│   ├── area/cliente/
│   │   ├── Cliente.java
│   ├── atendimento/
│   │   ├── Atendente.java
│   │   ├── cozinha/
│   │   │   ├── Cozinheiro.java
│   │   │   ├── Almoxarife.java
│── Estabelecimento.java
```

## 📜 Explicação das Classes e Pacotes

### 📦 Pacote `lanchonete`
Este pacote representa o sistema geral da lanchonete, onde está a classe principal `Estabelecimento` que inicia a execução do código.

#### 🏠 `Estabelecimento.java`
- Classe principal do projeto, responsável por criar os objetos e simular o funcionamento da lanchonete.
- Instancia objetos das classes `Cliente`, `Atendente`, `Cozinheiro` e `Almoxarife`.
- Chama os métodos apropriados para demonstrar os diferentes níveis de visibilidade.

### 📦 Pacote `lanchonete.area.cliente`
Este pacote contém a classe que representa o cliente da lanchonete.

#### 🧑 `Cliente.java`
- Representa o cliente que interage com a lanchonete.
- Métodos públicos: `escolherLanche()`, `escolherSuco()`, `escolherVitamina()`, `escolherCombo()`, `fazerPedido()`, `pagarConta()`.
- Métodos privados: `consultarSaldo()`.
- Contém um método comentado (`pegarPedidoBalcao()`), pois um cliente não deveria pegar o pedido diretamente.

### 📦 Pacote `lanchonete.atendimento`
Este pacote contém a classe responsável pelo atendimento ao cliente.

#### 🏪 `Atendente.java`
- Representa o funcionário que atende os clientes e gerencia os pedidos.
- Métodos públicos: `anotarPedido()`, `servirMesa()`, `receberPagamento()`.
- Métodos privados: `pegarLancheCozinha()`, `pegarPedidoBalcao()`.
- Método default: `trocarGas()`, que só pode ser acessado dentro do pacote.

### 📦 Pacote `lanchonete.atendimento.cozinha`
Este pacote contém as classes que representam os funcionários responsáveis pela cozinha.

#### 👨‍🍳 `Cozinheiro.java`
- Responsável pelo preparo dos alimentos.
- Métodos privados: `lavarIngredientes()`, `baterIngredientesLiquidificador()`, `selecionarIngredienteLanche()`, `selecionarIngredienteVitamina()`, `prepararLanche()`, `prepararVitamina()`, `prepararCombo()`, `fritarIngredienteLanche()`, `trocarGas()`, `pedirIngrediente()`.
- Métodos públicos: `adicionarLancheBalcao()`, `adicionarSucoBalcao()`, `adicionarComboBalcao()`.
- Contém um método comentado (`trocarGas(Atendente atendente)`), pois o atendente não pode trocar o gás.

#### 📦 `Almoxarife.java`
- Responsável pelo controle de estoque da lanchonete.
- Métodos privados: `controlarEntrada()`, `controlarSaida()`.
- Métodos públicos: `pedirIngrediente()`.
- Métodos default: `entregarIngrediente()`, `trocarGas()`.

## 🚀 Como Executar os Exemplos

1. Clone este repositório:
   ```sh
   git clone https://github.com/italospina/Java-Basico/tree/main/7-visibilidade-recursos
   ```
2. Navegue até a pasta do projeto:
   ```sh
   cd 7-visibilidade-recursos
   ```
3. Compile e execute o código:
   ```sh
   javac lanchonete/**/*.java
   java lanchonete.Estabelecimento
   ```

## 📌 Conclusão
O controle adequado da visibilidade de recursos permite criar aplicações mais seguras e organizadas, limitando o acesso apenas aos métodos e atributos necessários.
---
## 📚 Recursos Úteis

- [Documentação Oficial do Java](https://docs.oracle.com/en/java/)
- [Java Tutorials](https://www.w3schools.com/java/)


## 📜 Licença

Este repositório está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---
Criado por [Italo Spina](https://github.com/italospina).
