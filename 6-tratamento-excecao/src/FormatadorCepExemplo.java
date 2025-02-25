// Classe de exceção personalizada
class CepInvalidoException extends Exception {
    public CepInvalidoException(String mensagem) {
        super(mensagem);
    }
}

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        String cep = "1234567"; // Teste com um CEP inválido
        
        try {
            String cepFormatado = formatarCep(cep);
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8 || !cep.matches("\\d{8}")) {
            throw new CepInvalidoException("O CEP deve conter exatamente 8 dígitos numéricos.");
        }

        // Formata o CEP no padrão XX.XXX-XXX
        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5, 8);
    }
}