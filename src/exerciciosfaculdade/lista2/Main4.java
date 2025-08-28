package exerciciosfaculdade.lista2;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma String");
        String palavra = sc.nextLine();

        int op;

        System.out.println("[1] O número de caracteres da string.");
        System.out.println("[2] A String com todas suas letras em maiúsculo.");
        System.out.println("[3] A String com todas suas letras em minúsculo.");
        System.out.println("[4]O número de vogais da string.");
        System.out.println("[5] Se a String digitada começa com “UE” (ignorando maiúsculas/minúsculas).");
        System.out.println("[6] Imprimir a String de maneira inversa.");
        System.out.println("Escolha uma opcao: ");
        op = sc.nextInt();

        switch(op) {

            case 1:
                System.out.println("O numero de letras e: "+palavra.length());
                break;

            case 2:
                System.out.println(palavra.toUpperCase());
                break;

            case 3:
                System.out.println(palavra.toLowerCase());
                break;

            case 4:
                int contador =0;

                for(int i = 0;i<palavra.length();i++) {

                    if (palavra.charAt(i) == 'A' || palavra.charAt(i) == 'a') {
                        contador+=1;
                    }
                    if (palavra.charAt(i) == 'E' || palavra.charAt(i) == 'e') {
                        contador+=1;
                    }
                    if (palavra.charAt(i) == 'I' || palavra.charAt(i) == 'i') {
                        contador+=1;
                    }
                    if (palavra.charAt(i) == 'O' || palavra.charAt(i) == 'o') {
                        contador+=1;
                    }
                    if (palavra.charAt(i) == 'U' || palavra.charAt(i) == 'u') {
                        contador+=1;
                    }


                }
                System.out.println("O numero de vogais é: "+contador);

                break;

            case 5:

                if (palavra.charAt(0) == 'U' || palavra.charAt(0) == 'u' && palavra.charAt(1) == 'E' || palavra.charAt(1) == 'e') {
                    System.out.println("Sim a palavra "+palavra+" comeca com UE!!!");
                }
                else {
                    System.out.println("Não comeca com ue!!!!");
                }

                break;

            case 6:

                String reversa = "";

                for (int i =palavra.length()-1; i >= 0 ;i--){
                    reversa += palavra.charAt(i);
                }

                System.out.println(reversa);

                break;

            default:
                System.out.println("Opcao invalida!!!!");
                break;

        }


    }

}
