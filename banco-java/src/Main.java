public class Main {
    public static void main(String[] args) {
        boolean validationEmail;
        String emailTest = "teste@email.com";

        Email email = new Email(emailTest);

        validationEmail = Email.isEmail(emailTest);

        System.out.println(validationEmail);


        CheckingAccount account = new CheckingAccount();
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Current balance: " + account.getCurrentBalance());
        account.deposit(1000);
        account.withdrawal(600);
        System.out.println("Current balance: " + account.getCurrentBalance());
        account.withdrawal(700);
        System.out.println("Current balance: " + account.getCurrentBalance());


    }
}
