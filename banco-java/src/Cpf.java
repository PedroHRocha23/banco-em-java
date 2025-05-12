public class Cpf {

    private String cpf;

    public Cpf(String cpf){
        this.cpf = cpf;
    }

    private static boolean isCpf(String cpf){

        if (cpf.length() != 11){
            return false;
        }
        return true;
    }


}
