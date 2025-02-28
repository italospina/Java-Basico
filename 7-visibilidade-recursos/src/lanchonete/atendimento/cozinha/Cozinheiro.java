package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    // metodos que ten que estar privados
    private void lavarIngredientes() {
        System.out.println("Ingredientes lavados");
    }

    private void baterIngredientesLiquidificador() {
        System.out.println("Ingredientes batidos no liquidificador");
    }

    private void selecionaIngredienteLanche() {
        System.out.println("Ingrediente selecionado para lanche");
    }

    private void selecionaIngredienteVitamina() {
        System.out.println("Ingrediente selecionado para vitamina");
    }

    private void prepararLanche() {
        System.out.println("Lanche preparado");
    }

    private void prepararVitamina() {
        System.out.println("Vitamina preparado");
    }

    private void preparaCombo() {
        prepararLanche();
        prepararVitamina();
        System.out.println("Combo preparado");
    }

    private void fritarIngredienteLanche() {
        System.out.println("Ingrediente frito para lanche");
    }

    private void trocarGas ( Almoxarife almoxarife) {
        almoxarife.trocarGas();
        System.out.println("Gás trocado");
    }

    private void pedirIngrediente(Almoxarife almoxarife) {
        almoxarife.pedirIngrediente();
        System.out.println("Ingrediente pedido");
    }

    // metodos que podem ser publicos
    public void adicionarLancheBalcao() {
        System.out.println("Lanche adicionado ao balcão");
    }

    public void adicionarSucoBalcao() {
        System.out.println("Suco adicionado ao balcão");
    }

    public void adicionarComboBalcao() {
        adicionarLancheBalcao();
        adicionarSucoBalcao();
        System.out.println("Combo adicionado ao balcão");
    }


    //cozinheiro não pode solicitar ao atendente
    /* 
    public void trocarGas(Atendente atendente) {
        atendente.trocarGas();
        System.out.println("Gás trocado");
        
    }
    */
}
