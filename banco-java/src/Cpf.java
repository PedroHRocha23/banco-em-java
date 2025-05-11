public class Cpf {

    private String cpf;

    public Cpf(String cpf){
        this.cpf = cpf;
    }

    private static boolean isCpf(String cpf){



        if (cpf.length() != 11){
            System.out.println("Cpf inválido - Mais de 11 dígitos");
        }

    }


}
