package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.heranca;

public class ClassA {

    private Integer number;
    private String holder;
    protected Double balance;

    public ClassA(){
    }

    public ClassA(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double number){
        this.balance -= number;
    }

    public void deposit(Double number){
        this.balance += number;
    }

}
