package progamasDasAulasOrientadasAObjetos.enumeracao.exercicio01.entities;

import progamasDasAulasOrientadasAObjetos.enumeracao.exercicio01.entities.enums.NivelDoTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {

    private String name;
    private NivelDoTrabalhador level;
    private double baseSalario;

    private Departamento departamento;
    private List<ContradoPorHora> contratos = new ArrayList<>();

    public Trabalho(){

    }

    public Trabalho(String name, NivelDoTrabalhador level, double baseSalario, Departamento departamento) {
        this.name = name;
        this.level = level;
        this.baseSalario = baseSalario;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelDoTrabalhador getLevel() {
        return level;
    }

    public void setLevel(NivelDoTrabalhador level) {
        this.level = level;
    }

    public double getBaseSalario() {
        return baseSalario;
    }

    public void setBaseSalario(double baseSalario) {
        this.baseSalario = baseSalario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContradoPorHora> getContratos() {
        return contratos;
    }

    public void adicionarContrato(ContradoPorHora contrato){
        contratos.add(contrato);
    }

    public void removerContrato(ContradoPorHora contrato){
        contratos.remove(contrato);
    }

    public double renda(int ano,int mes){
        double soma = baseSalario;
        Calendar cal = Calendar.getInstance();

        for(ContradoPorHora contrato: contratos){
            cal.setTime(contrato.getDate());
            int contrato_Ano = cal.get(Calendar.YEAR);
            int contrato_Mes = cal.get(Calendar.MONTH) + 1;

            if (contrato_Ano == ano && contrato_Mes == mes){
                soma += contrato.valorTotal();
            }
        }
        return soma;
    }
    @Override
    public String toString() {
        return "Nome = " + name + '\'' + "Departamento = " + departamento ;
    }
}
