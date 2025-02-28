package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        
        // Instanciação do cozinheiro
        Cozinheiro cozinheiro = new Cozinheiro();
        
        // Métodos internos do cozinheiro (ações que não precisam ser expostas ao estabelecimento)
        /* 
        cozinheiro.lavarIngredientes();
        cozinheiro.baterIngredientesLiquidificador();
        cozinheiro.selecionarIngredienteLanche();
        cozinheiro.selecionarIngredienteVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.preparaCombo();
        */

        // Métodos expostos para o estabelecimento
        cozinheiro.adicionarComboBalcao();
        cozinheiro.adicionarLancheBalcao();
        cozinheiro.adicionarSucoBalcao();
        
        // O almoxarife gerencia o estoque, mas suas ações não precisam ser chamadas diretamente
        /* 
        Almoxarife almoxarife = new Almoxarife();
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        */
        
        // Instanciação do atendente
        Atendente atendente = new Atendente();
        
        // Métodos internos do atendente
        /* 
        atendente.pegarLancheCozinha();
        atendente.pegaPedidoBalcao();
        */
        
        // Métodos expostos do atendente
        atendente.anotarPedido();
        atendente.servirMesa();
        atendente.receberPagamento();
        
        // Instanciação do cliente
        Cliente cliente = new Cliente();
        cliente.escolherCombo();
        cliente.escolherLanche();
        cliente.escolherSuco();
        cliente.escolherVitamina();
        cliente.fazerPedido();
        cliente.pagarConta();
        
        // O cliente não deveria ter acesso a essa ação, mas não há regras definidas
        /* cliente.pegaPedidoBalcao(); */
        
        // Método sigiloso, não deveria estar disponível para o cliente
        /* cliente.consultaSaldo(); */
        
        // Métodos internos da cozinha que não devem ser acessíveis externamente
        /* cozinheiro.trocarGas(almoxarife); */
        
        // Ações indisponíveis para certas funções
        /* cozinheiro.trocarGas(atendente); */
        /* atendente.trocarGas(); */
        /* almoxarife.entregarIngrediente(); */
    }
}
