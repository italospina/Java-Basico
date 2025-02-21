public class FormatadorCepExemplo {
    public static void main(String[] args) {
        String cep = "1234567";
        
        try {
            String cepFormatado = formatarCep(cep);
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não possui 8 dígitos. " + e);		
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        
        return "12.345-678";
    }
}
