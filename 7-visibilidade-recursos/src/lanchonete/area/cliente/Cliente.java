package lanchonete.area.cliente;

public class Cliente {

    //metodos privados
    private void consultaSaldo() {
        System.out.println("Cliente consultando saldo");
    }
    
    //metodos publicos
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

    //metodos que nao deveriam existir
    /* 
    public void pegaPedidoBalcao() {
        System.out.println("Cliente pegando pedido no balcão");
    } 
    */
}
