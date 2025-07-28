package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.polimorfismo.exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int numberOfEmployee = sc.nextInt();
        sc.nextLine();

        List<Employee> list = new ArrayList<>();

        for (int i = 0;i < numberOfEmployee;i++){
            System.out.println("Employee #"+(i+1)+ " data: ");

            System.out.println("Outsourced (y/n)? ");
            String yesOrNo = sc.nextLine().toLowerCase();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Hours: ");
            Integer hour = sc.nextInt();
            sc.nextLine();

            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if (yesOrNo.equals("y")) {

                System.out.println("Additional charge: ");
                Double addtionalCharge = sc.nextDouble();
                sc.nextLine();

                OutSourceEmployee outSourceEmployee = new OutSourceEmployee(name,hour,valuePerHour,addtionalCharge);
                list.add(outSourceEmployee);

            }

            else{

                Employee employe = new Employee(name,hour,valuePerHour);
                list.add(employe);

            }

        }

        System.out.println("Payments: ");

        for (Employee employee:list) {
            System.out.println(employee.getName()+": "+employee.payment());
        }

    }
}
