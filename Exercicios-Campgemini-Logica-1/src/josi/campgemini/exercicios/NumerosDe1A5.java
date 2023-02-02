package josi.campgemini.exercicios;

import java.util.Scanner;

/*Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
Caso o usuário digite um número 
que não esteja neste intervalo,
exibir a seguinte mensagem: número inválido*/

public class NumerosDe1A5 {

    public static void main(String[] acrgs){

        int X;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Informe um número no intervalo de 1 a 5: ");
            X = leitor.nextInt();
        }

        /*Irei utilizar a estrutra Switch para delimitar os casos de
         * escolha do usuário.
         */

        switch (X){
            case 1:
            System.out.println("Número um.");
            break;
            case 2:
            System.out.println("Número dois.");
            break;
            case 3:
            System.out.println("Número três.");
            break;
            case 4:
            System.out.println("Número quatro.");
            break;
            case 5:
            System.out.println("Número cinco.");
            break;
            default:
            System.out.println(" Número inválido");
            break;
        }   
    }
}