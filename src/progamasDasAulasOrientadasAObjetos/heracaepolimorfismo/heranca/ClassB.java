package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.heranca;

public class ClassB extends ClassA{

    private Double loanLimit;

    public ClassB(){
        super();
    }

    public ClassB(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (loanLimit <= amount){
            balance += amount - 10.0;
        }
    }


}
