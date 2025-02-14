package italo.segundasemana;
public class MinhaClasse{
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
        //declaração de variavel
        int ano = 2025;
        ano = 2026;
        
        //algumas variaveis não podem ser alterados nunca como por exemplo as abaixo
        //esse problema é solucionado colocando final antes do tipo da variavel
        final String BR = "Brasil";

        //pra chamar um outro metodo devera ser criado uma variavel com nome dele para passar o que ele ira retornar no metodo
        String primeiroNome = "Italo";
        String Sobrenome = "Spina";

        String nomeCompleto = nomeCompleto(primeiroNome, Sobrenome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String Sobrenome){
        return "Metodo chama nome:" +primeiroNome.concat(" ").concat(Sobrenome);


    }
}