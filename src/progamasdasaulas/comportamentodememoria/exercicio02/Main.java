package progamasdasaulas.comportamentodememoria.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();

        System.out.println("Quantos funcionarios serao registrados?: ");
        int quantidadeFuncionarios = sc.nextInt();
        sc.nextLine();

        for (int i = 0 ; i < quantidadeFuncionarios ; i++){
            System.out.println("Funcionario #"+(i+1)+": ");

            Integer id;

            do {
                System.out.print("ID: ");
                id = sc.nextInt();
                sc.nextLine();

                if (idInlist(list, id)) {
                    System.out.println("ID já existe! Tente outro.");
                }

            } while (idInlist(list, id));

            System.out.println("Nome: ");
            String name = sc.nextLine();

            System.out.println("Salario: ");
            Double salary = sc.nextDouble();
            sc.nextLine();

            Empregado emp = new Empregado(id,name,salary);
            list.add(emp);

        }

        System.out.println("Entre com um id para dar um aumento: ");
        Integer flagId = sc.nextInt();
        sc.nextLine();
        Integer pos = positionList(list,flagId);

        if(pos != null) {

            System.out.println("Quantos porcento quer aumento o salario do empregado #" + (pos + 1) + ": ");
            double percentage = sc.nextDouble();
            sc.nextLine();
            list.get(pos).increaseSalary(percentage);
        }
        else{
            System.out.println("Id não encontrado!!!");
        }

        for (Empregado emp:list){
            System.out.println(emp.toString());
        }

    }

    public static Integer positionList(List<Empregado> list , Integer id){
        for (int i = 0 ; i < list.size() ; i++) {
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }
        return null;
    }

    public static Boolean idInlist(List<Empregado> list , Integer id){

        for (Empregado empregado : list) {
            if (empregado.getId().equals(id)) {
                return true;
            }
        }
        return false;

    }

}
