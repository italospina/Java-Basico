import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome, sobrenome;
        double altura = 0.0;
        int idade = 0;

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        sobrenome = sc.nextLine();
        
        try {
            System.out.println("Digite a sua idade: ");
            idade = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("o campo idade precisa ser numerico: " + e);
        }

        try {
            System.out.println("Digite a sua altura: ");
        altura = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("o campo altura precisa ser numerico: " + e);
        }

        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}
