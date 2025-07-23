package progamasDasAulasOrientadasAObjetos.enumeracao.exercicio01.application;

import progamasDasAulasOrientadasAObjetos.enumeracao.exercicio01.entities.ContradoPorHora;
import progamasDasAulasOrientadasAObjetos.enumeracao.exercicio01.entities.Departamento;
import progamasDasAulasOrientadasAObjetos.enumeracao.exercicio01.entities.Trabalho;
import progamasDasAulasOrientadasAObjetos.enumeracao.exercicio01.entities.enums.NivelDoTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat dataDoContrato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dataCalcularRenda = new SimpleDateFormat("MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String namedepartamento = sc.nextLine();

        System.out.println("Entre com as informações do trabalhador: ");
        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.println("Nivel: ");
        String levelDoTrabalhador = sc.nextLine();

        System.out.print("Base salaria: ");
        double baseSalario = sc.nextDouble();;
        sc.nextLine();

        System.out.println("Quantos contratos quer fazer: ");
        int quantidadeContratos = sc.nextInt();;
        sc.nextLine();

        NivelDoTrabalhador nivel = NivelDoTrabalhador.valueOf(levelDoTrabalhador.toUpperCase());
        Trabalho trabalhodor = new Trabalho(name,nivel,baseSalario,new Departamento(namedepartamento));

        for (int i = 0 ; i < quantidadeContratos ; i++){
            System.out.println("Entre com as informacoes do #"+(i+1)+"° contrato: ");

            System.out.print("DATA (DD/MM/YYYY): ");
            Date contratedate = dataDoContrato.parse(sc.next());

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            sc.nextLine();

            System.out.print("Quantidade de horas: ");
            Integer horas = sc.nextInt();
            sc.nextLine();

            ContradoPorHora contrato = new ContradoPorHora(contratedate,valorPorHora,horas);
            trabalhodor.adicionarContrato(contrato);
        }

        System.out.println("Escolha a data(mes/ano) para calcular a renda: ");
        Date dataCalculorenda = dataCalcularRenda.parse(sc.next());

        System.out.print(trabalhodor);

        Calendar cal = Calendar.getInstance();
        cal.setTime(dataCalculorenda);
        int contrato_Ano = cal.get(Calendar.YEAR);
        int contrato_Mes = cal.get(Calendar.MONTH)+1;

        System.out.println("Renda = " + trabalhodor.renda(contrato_Ano,contrato_Mes));

        sc.close();;
    }
}
