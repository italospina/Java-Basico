package italo.primeirasemana;
public class BoletimEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal<6) 
            System.out.println("Reprovado");
        else if (mediaFinal ==6)
            System.out.println("Recuperação");
        else
            System.out.println("Aprovado");

    }

}
