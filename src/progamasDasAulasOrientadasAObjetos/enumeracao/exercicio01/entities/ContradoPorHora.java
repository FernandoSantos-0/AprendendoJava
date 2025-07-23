package progamasDasAulasOrientadasAObjetos.enumeracao.exercicio01.entities;

import java.util.Date;

public class ContradoPorHora {

    private Date date;
    private double valorporhora;
    private Integer horas;

    public ContradoPorHora(){

    }

    public ContradoPorHora(Date date, double valorporhora, Integer horas) {
        this.date = date;
        this.valorporhora = valorporhora;
        this.horas = horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValorporhora() {
        return valorporhora;
    }

    public void setValorporhora(double valorporhora) {
        this.valorporhora = valorporhora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valorTotal(){
        return valorporhora*horas;
    }
}
