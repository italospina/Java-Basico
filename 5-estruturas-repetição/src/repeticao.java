public class repeticao {
    public static void main(String[] args) {
        
        // Exemplo de for
        System.out.println("Exemplo de for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteração " + i);
        }

        // Exemplo de while
        System.out.println("\nExemplo de while:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Iteração " + contador);
            contador++;
        }

        // Exemplo de do-while
        System.out.println("\nExemplo de do-while:");
        int num = 1;
        do {
            System.out.println("Iteração " + num);
            num++;
        } while (num <= 5);

        // Exemplo de foreach (para arrays e coleções)
        System.out.println("\nExemplo de foreach:");
        int[] numeros = {10, 20, 30, 40, 50};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }
}
