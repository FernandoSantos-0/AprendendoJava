package progamasDasAulasOrientadasAObjetos.exercicio04;

public class Client {

    private String nameAccount;
    private int numberAccount;
    private double accountBalance;

    public Client(String nameAccount, int numberAccount) {
        this.nameAccount = nameAccount;
        this.numberAccount = numberAccount;
        accountBalance = 0;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double setAccountBalance(double accountBalance, int number) {
        if (number == 1) {
            return this.accountBalance += accountBalance;
        }
        else{
            return this.accountBalance = (this.accountBalance - accountBalance) - 5;
        }
    }
}