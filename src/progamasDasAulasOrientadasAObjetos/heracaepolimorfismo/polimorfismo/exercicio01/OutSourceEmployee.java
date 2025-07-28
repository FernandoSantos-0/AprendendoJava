package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.polimorfismo.exercicio01;

public class OutSourceEmployee extends Employee{

    private Double addtionalCharge;

    public OutSourceEmployee(){
    }

    public OutSourceEmployee(String name, Integer hour, Double valueperhour, Double addtionalCharge) {
        super(name, hour, valueperhour);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + (addtionalCharge*1.1);
    }

}
