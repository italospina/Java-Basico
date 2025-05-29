public class SistemaIbge {
    public static void main(String[] args) {
        // Exemplo de uso do enum EstadosBrasileiros
        for (EstadosBrasileiros estado : EstadosBrasileiros.values()) {
            System.out.println("Estado: " + estado.getNome() + ", Sigla: " + estado.getSigla() + ", Nome Maiúsculo: " + estado.getNomeMaiusculo());
        }

        EstadosBrasileiros estadoSelecionado = EstadosBrasileiros.SAO_PAULO;
        System.out.println("Estado selecionado: " + estadoSelecionado.getNome() + ", Sigla: " + estadoSelecionado.getSigla() + ", Nome Maiúsculo: " + estadoSelecionado.getNomeMaiusculo());
    }
}
