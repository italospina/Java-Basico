package lanchonete.atendimento;

public class Atendente {
    //metodos privados
    private void pegarLancheCozinha() {
        System.out.println("Atendente pegando lanche na cozinha");
    }

    private void pegaPedidoBalcao() {
        System.out.println("Atendente pegando pedido no balcão");
    }
    
    //metodos publicos
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

    
    //metodos defaut
    void trocarGas() {
        System.out.println("Atendente trocando gás");
    }
}
