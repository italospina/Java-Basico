import java.io.Console;

public class metodos {
    
        // Método sem retorno (void) - Apenas imprime uma mensagem
        public void exibirMensagem() {
            System.out.println("Olá, mundo!");
        }
        
        // Método com retorno - Retorna o dobro de um número
        public int dobrarNumero(int numero) {
            return numero * 2;
        }
        
        // Método com vários parâmetros - Calcula a média de duas notas
        public double calcularMedia(double nota1, double nota2) {
            return (nota1 + nota2) / 2;
        }
        
        // Método estático - Pode ser chamado sem precisar instanciar a classe
        public static int multiplicar(int a, int b) {
            return a * b;
        }

        // Método estático - Realiza a divisão entre dois números
        public static double dividir(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero não permitida");
            }
            return a / b;
        }
        
        // Sobrecarga de método - Mesmo nome, diferentes parâmetros
        public int soma(int a, int b) {
            return a + b;
        }
        
        public double soma(double a, double b) {
            return a + b;
        }
        
        // Método construtor - Inicializa um objeto ao ser criado
        public static class Pessoa {
            public String nome;
            
            public Pessoa(String nome) {
                this.nome = nome;
            }
        }
        
        public static void main(String[] args) {
            // Criando um objeto da classe Main
            Main programa = new Main();
            
            // Chamando método sem retorno
            programa.exibirMensagem();
            
            // Chamando método com retorno
            int dobro = programa.dobrarNumero(5);
            System.out.println("Dobro: " + dobro);
            
            // Chamando método com múltiplos parâmetros
            double media = programa.calcularMedia(8.5, 9.2);
            System.out.println("Média: " + media);
            
            // Chamando método estático
            int multiplicacao = multiplicar(3, 4);
            System.out.println("Multiplicação: " + multiplicacao);

            // Chamando método de divisão
            try {
                double divisao = dividir(10, 2);
                System.out.println("Divisão: " + divisao);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            
            // Chamando métodos sobrecarregados
            int soma1 = programa.soma(5, 10);
            double soma2 = programa.soma(5.5, 2.3);
            System.out.println("Soma Inteira: " + soma1);
            System.out.println("Soma Decimal: " + soma2);
            
            // Criando um objeto da classe Pessoa com o construtor
            Pessoa pessoa = new Pessoa("João");
            System.out.println("Nome da Pessoa: " + pessoa.nome);
        }
    }    


