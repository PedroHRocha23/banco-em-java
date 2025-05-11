public class Main {
    public static void main(String[] args) {
        boolean validationEmail;
        String emailTest = "teste@email.com";

        Email email = new Email(emailTest);

        validationEmail = Email.isEmail(emailTest);

        System.out.println(validationEmail);

    }
}
