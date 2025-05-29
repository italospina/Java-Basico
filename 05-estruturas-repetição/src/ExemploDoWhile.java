import java.util.Random;// Importa a classe Random para gerar números aleatórios

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("Telefone Tocando");
        } while (tocando());

        System.out.println("Alo");

    }

    // Método privado e estático que retorna um booleano
    private static boolean tocando(){
        
        // Gera um número aleatório entre 0 e 2 (ou seja, 0, 1 ou 2) e verifica se é igual a 1.
        // Se for igual a 1, 'atendeu' será verdadeiro; caso contrário, será falso.
        boolean atendeu = new Random().nextInt(3)==1;

        // Exibe no console se a chamada foi atendida ou não
        System.out.println("Atendeu? " + atendeu);

        // Retorna o valor oposto de 'atendeu'. 
        // Se 'atendeu' for true (ou seja, atendeu a chamada), retorna false.
        // Se 'atendeu' for false (não atendeu), retorna true (ainda está tocando).
        return ! atendeu;
    }
}
