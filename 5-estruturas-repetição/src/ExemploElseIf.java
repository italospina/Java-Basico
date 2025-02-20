public class ExemploElseIf {
    public static void main(String[] args) {
        double saldo = 16.35;
        double valorSolicitado = 10;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("Transição feita, saldo agora é: R$" + String.format("%.2f", saldo) );
        } 
        
        else if (valorSolicitado == saldo) {
            System.out.println("Transição feita, saldo agora está zerado");
        }

        else {
            
            System.out.println("Valor solicitado é menor que o saldo.");
        } 

    }
}
