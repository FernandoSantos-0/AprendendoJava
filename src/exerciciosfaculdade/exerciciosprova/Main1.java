package exerciciosfaculdade.exerciciosprova;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Insira um string: ");
        String texto = sc.nextLine();

        System.out.println("numero de caracter" + texto.length());
        System.out.println("Maiusculo: "+ texto.toUpperCase());
        System.out.println("Minusculo: "+ texto.toLowerCase());

        String texto1 = texto.toUpperCase();

        for (int i = 0; i < texto.length();i++){

            char c = texto1.charAt(i);

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                contador++;
            }

        }

        System.out.println("Quantidades de vogais: "+contador);

        if (texto.toUpperCase().charAt(0) == 'U' && texto.toUpperCase().charAt(0) == 'E'){
            System.out.println("a palavras comeca com UE"+texto);
        }else{
            System.out.println("A palavra nao comeca com UE" + texto);
        }

        for (int i = 0; i < texto.length();i++){
            System.out.print(texto.charAt((texto.length()-1) - i));
        }


    }

}
