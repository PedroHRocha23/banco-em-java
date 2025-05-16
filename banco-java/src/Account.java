import java.util.Random;

public class Account {

    private final int accountNumber;
    private double balance;

    public Account(){
        this.accountNumber = createAccountNumber();
        this.balance = 0.0D;
    }

    private static int createAccountNumber(){
        Random randomNumber = new Random();
        int number = -1;
        while (number <= 0){
            number = randomNumber.nextInt();
        }
        return number;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getCurrentBalance(){
        return this.balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdrawal(double value){
        if (this.balance < value){
            System.out.println("\nInsufficient balance!");
            return;
        }
        this.balance -= value;
    }
}

