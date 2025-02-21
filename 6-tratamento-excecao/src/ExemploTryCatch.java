import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Digite a sua altura: ");
        double altura = sc.nextInt();

        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        
        
        try {
            

            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        }
    }
}
