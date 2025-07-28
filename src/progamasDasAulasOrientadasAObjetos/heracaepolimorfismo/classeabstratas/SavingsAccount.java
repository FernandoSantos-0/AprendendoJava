package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.classeabstratas;

//final impede que a class seja herdada.

public final class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance *= (balance/interestRate);
    }

    //já o final no metodo impede que outra classe que esta herdadedo essa sobreponha ele.

    @Override
    public void withdraw(Double number){
        balance -= number;
    }

}
