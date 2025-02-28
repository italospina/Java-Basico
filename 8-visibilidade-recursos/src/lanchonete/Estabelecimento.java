package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que o estabelecimento NÃO precisa ter ciencia
        /* 
        cozinheiro.lavarIngredientes();
        cozinheiro.baterIngredientesLiquidificador();
        cozinheiro.selecionaIngredienteLanche();
        cozinheiro.selecionaIngredienteVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.preparaCombo(); 
        */

        //ações que o estabelecimento tem ciencia
        cozinheiro.adicionarComboBalcao();
        cozinheiro.adicionarLancheBalcao();
        cozinheiro.adicionarSucoBalcao();

        //não precisa criar um objeto para chamar o método
        /*
        Almoxarife almoxarife = new Almoxarife();
        */

        //ações que nao precisa estar disponivel para a aplicação
        /* 
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida(); 
        */
        
        Atendente atendente = new Atendente();
        
        //ações que nao precisa estar disponivel para a aplicação
        /* 
        atendente.pegarLancheCozinha();
        atendente.pegaPedidoBalcao(); 
        */
        atendente.anotarPedido();
        atendente.servirMesa();
        atendente.receberPagamento();
        
    
        Cliente cliente = new Cliente();
        cliente.escolherCombo();
        cliente.escolherLanche();
        cliente.escolherSuco();
        cliente.escolherVitamina();
        cliente.fazerPedido();
        cliente.pagarConta();

        //nao deveria, mas estabelecimento nao definiu normas de atendimento
        /* cliente.pegaPedidoBalcao(); */

        //ação sigilosa
        /* cliente.consultaSaldo(); */

        //ação que o cliente nao precisa saber
        /* cozinheiro.trocarGas(almoxarife); */
        
        //ação indisponivel
        /* cozinheiro.trocarGas(atendente); */
        /* atendente.trocarGas(); */
        /* almoxarife.entregarIngrediente();  */

    }
}
