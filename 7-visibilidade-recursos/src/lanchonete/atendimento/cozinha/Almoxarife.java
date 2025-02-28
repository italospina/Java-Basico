package lanchonete.atendimento.cozinha;

public class Almoxarife {

    // Métodos privados (ações internas que não devem ser acessíveis externamente)
    private void controlarEntrada() {
        System.out.println("Controlando a entrada de ingredientes no estoque");
    }

    private void controlarSaida() {
        System.out.println("Controlando a saída de ingredientes do estoque");
    }

    // Métodos públicos (ações disponíveis para outras classes)
    public void pedirIngrediente() {
        System.out.println("Almoxarife solicitando ingredientes ao fornecedor");
    }

    // Métodos de acesso padrão (default) – visíveis apenas dentro do mesmo pacote
    void entregarIngrediente() {
        System.out.println("Almoxarife entregando ingrediente para a cozinha");
        controlarSaida(); // Atualiza a saída de ingredientes ao entregar
    }

    void trocarGas() {
        System.out.println("Almoxarife realizando a troca do gás na cozinha");
    }
}
