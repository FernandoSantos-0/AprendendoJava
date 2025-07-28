package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.polimorfismo.exercicio01;

public class Employee {

    private String name;
    private Integer hour;
    private Double valuePerHour;

    public Employee(){
    }

    public Employee(String name, Integer hour, Double valueperhour) {
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valueperhour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValueperhour() {
        return valuePerHour;
    }

    public void setValueperhour(Double valueperhour) {
        this.valuePerHour = valueperhour;
    }

    public Double payment(){
        return valuePerHour * hour;
    }

}
