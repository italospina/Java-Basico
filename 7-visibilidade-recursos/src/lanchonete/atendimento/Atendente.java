package lanchonete.atendimento;

public class Atendente {

    // Métodos privados (ações internas do atendente que não devem ser acessadas externamente)
    private void pegarLancheCozinha() {
        System.out.println("Atendente pegando lanche na cozinha");
    }

    private void pegarPedidoBalcao() {
        System.out.println("Atendente pegando pedido no balcão");
    }
    
    // Métodos públicos (ações disponíveis para outras classes)
    public void servirMesa() {
        pegarLancheCozinha();
        System.out.println("Atendente servindo mesa");
    }

    public void receberPagamento() {
        System.out.println("Atendente recebendo pagamento");
    }

    public void anotarPedido() {
        System.out.println("Atendente anotando pedido");
    }

    // Métodos default (disponíveis apenas dentro do mesmo pacote)
    void trocarGas() {
        System.out.println("Atendente trocando gás");
    }
}
