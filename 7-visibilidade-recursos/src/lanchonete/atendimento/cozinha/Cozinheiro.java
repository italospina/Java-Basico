package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    // Métodos privados (ações internas do cozinheiro que não devem ser acessadas externamente)
    private void lavarIngredientes() {
        System.out.println("Ingredientes lavados");
    }

    private void baterIngredientesLiquidificador() {
        System.out.println("Ingredientes batidos no liquidificador");
    }

    private void selecionarIngredienteLanche() {
        System.out.println("Ingrediente selecionado para o lanche");
    }

    private void selecionarIngredienteVitamina() {
        System.out.println("Ingrediente selecionado para a vitamina");
    }

    private void prepararLanche() {
        System.out.println("Lanche preparado");
    }

    private void prepararVitamina() {
        System.out.println("Vitamina preparada");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
        System.out.println("Combo preparado");
    }

    private void fritarIngredienteLanche() {
        System.out.println("Ingrediente frito para o lanche");
    }

    private void trocarGas(Almoxarife almoxarife) {
        almoxarife.trocarGas();
        System.out.println("Gás trocado");
    }

    private void pedirIngrediente(Almoxarife almoxarife) {
        almoxarife.pedirIngrediente();
        System.out.println("Ingrediente solicitado");
    }

    // Métodos públicos (ações disponíveis para outras classes)
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

    // O cozinheiro não pode solicitar a troca de gás ao atendente
    /* 
    public void trocarGas(Atendente atendente) {
        atendente.trocarGas();
        System.out.println("Gás trocado");
    }
    */
}
