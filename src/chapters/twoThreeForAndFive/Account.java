package chapters.twoThreeForAndFive;

import java.util.Random;

public class Account {
    private String name;
    private double balance;

    public Account(String name) {
        this.name = name;

        if(hasBonus()) {
            System.out.printf("Parabéns %s, você ganhou uma bonificação de R$ %.2f.%n", name, 10.0);
            this.balance = 10.0;
        } else this.balance = 0.0;
    }

    private boolean hasBonus() {
        Random random = new Random();

        int num = random.nextInt(9);

        return  num % 2 == 0;
    }

    public void deposit(double value) {
        if(value > 0.0) balance += value;
    }

    public void reportAccount() {
        System.out.println("****** Informações de conta ******");
        System.out.printf("Nome: %s%n", name);
        System.out.printf("Saldo: %.2f%n", balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
