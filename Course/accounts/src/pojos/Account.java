package pojos;

import exceptions.InsufficientFundsException;

import java.math.BigDecimal;

public class Account {

    private long number;
    private String name;
    private BigDecimal balance;

    private static long nextNumber = 1001;

    public Account(String name) {
        this.number = nextNumber++;
        this.name = name;
        this.balance = new BigDecimal("0");
    }

    public Account(String name, BigDecimal balance) {
        this(name);
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws InsufficientFundsException {
        if (balance.compareTo(amount) > 0) {
            balance = balance.subtract(amount);
        }else {
            throw new InsufficientFundsException();
        }
    }

    public long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }
}
