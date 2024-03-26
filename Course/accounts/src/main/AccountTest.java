package main;

import exceptions.InsufficientFundsException;
import pojos.Account;

import java.math.BigDecimal;

public class AccountTest {
    public static void main(String[] args) {
        var a1 = new Account("Woodcock");
        var a2 = new Account("Ellison", new BigDecimal("250"));

        a2.deposit(new BigDecimal("100"));
        try {
            a2.withdraw(new BigDecimal("375"));
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficent Funds");
        }

        System.out.println(a2.getBalance());
    }
}
