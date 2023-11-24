package chapters.twoThreeForAndFive;

import javax.swing.*;

public class AccountTest {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao Sistema de contas.");
        Account accountCaio = new Account("Caio");
        Account accountMaria = new Account("Maria");

        accountCaio.reportAccount();
        accountCaio.deposit(50);
        accountCaio.deposit(22.45);
        accountCaio.reportAccount();

        accountMaria.deposit(33.33);
        accountMaria.reportAccount();
    }
}
