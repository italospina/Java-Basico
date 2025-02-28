package lanchonete.area.cliente;

public class Cliente {

    // Métodos privados (ações internas do cliente que não devem ser acessadas externamente)
    private void consultarSaldo() {
        System.out.println("Cliente consultando saldo");
    }
    
    // Métodos públicos (ações disponíveis para outras classes)
    public void escolherLanche() {
        System.out.println("Cliente escolhendo lanche");
    }

    public void escolherSuco() {
        System.out.println("Cliente escolhendo suco");
    }

    public void escolherVitamina() {
        System.out.println("Cliente escolhendo vitamina");
    }

    public void escolherCombo() {
        escolherLanche();
        escolherSuco();
        System.out.println("Cliente escolhendo combo");
    }

    public void fazerPedido() {
        System.out.println("Cliente fazendo pedido");
    }

    public void pagarConta() {
        System.out.println("Cliente pagando conta");
    }

    // Métodos que não deveriam estar disponíveis para o cliente
    /* 
    public void pegarPedidoBalcao() {
        System.out.println("Cliente pegando pedido no balcão");
    } 
    */
}
