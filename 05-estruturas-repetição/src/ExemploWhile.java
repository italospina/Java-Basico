import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.00;

        while (mesada > 0) {

            Double valorDoce = valorAleatorio();

            if (valorDoce <= mesada) {
                
                System.out.println("Doce com valor: R$" + String.format("%.2f ", valorDoce) + "Adicionado ao Carrinho.");
                mesada = mesada - valorDoce;
                
            } else {
                System.out.println("Valor Insuficiente para por no carrinho");
                break;
            }
        }
        System.out.println("Mesada: R$" + String.format("%.2f ", mesada));
        System.out.println("João gastou toda a mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}


public static void main(String[] args) 
{ int numero = 1; for (int x=1; x<2; x++){ numero = numero + x; } System.out.println("O valor de número é: " + numero); }