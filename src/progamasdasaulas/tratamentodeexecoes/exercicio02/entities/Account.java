package progamasdasaulas.tratamentodeexecoes.exercicio02.entities;

import progamasdasaulas.tratamentodeexecoes.exercicio02.excpetions.AccountExceptions;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;

    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws AccountExceptions {

        if (amount > withdrawLimit) {
           throw new AccountExceptions("Withdraw error: Amount exceeds withdraw limit");

        }
        if (amount > balance) {
            throw new AccountExceptions("Withdraw error: Not enough balance");

        }
        balance -= amount;
    }
}
