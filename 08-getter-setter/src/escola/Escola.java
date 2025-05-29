package escola;

public class Escola {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setIdade(20);

        System.out.println("Nome do aluno: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
    }
}
