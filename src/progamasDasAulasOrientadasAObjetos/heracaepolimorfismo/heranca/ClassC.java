package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.heranca;

public class ClassC extends ClassA{

    private Double interestRate;

    public ClassC(){
        super();
    }

    public ClassC(Integer number, String holder, Double balance, Double interestRate) {
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

}
