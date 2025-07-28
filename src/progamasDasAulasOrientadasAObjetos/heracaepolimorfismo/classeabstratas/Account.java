package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.classeabstratas;

// Com o abstract não e possivel instanciar esses objetos so os que o herdam, nesse caso essa class é considerada generica.

public abstract class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance) {
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
        this.balance -= number + 5.0;
    }

    public void deposit(Double number){
        this.balance += number;
    }



}
