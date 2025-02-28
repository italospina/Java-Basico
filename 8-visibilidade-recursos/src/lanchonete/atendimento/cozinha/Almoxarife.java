package lanchonete.atendimento.cozinha;

public class Almoxarife {

    //metodos privados

    private void controlarEntrada(){
        System.out.println("Controlando a entrada de ingredientes");
    }

    private void controlarSaida(){
        System.out.println("Controlando a saída de ingredientes");
    }

    //metodos publicos
    public void pedirIngrediente() {
        System.out.println("Almoxarife pedindo ingrediente");
    }

    //metodos default
    void entregarIngrediente(){
        System.out.println("Entregando ingrediente");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("Almoxarife trocando gás");
    }
}
