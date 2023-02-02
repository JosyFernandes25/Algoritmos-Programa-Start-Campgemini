package josi.campgemini.exercicios;

import java.util.Scanner;

/*Escreva um algoritmo que leia dois valores inteiros distintos e informe qual é o maior */

public class NumeroMaior {

    public static void main(String[] args){

        int x;
        int y;
        
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o valor de X: ");
            x = leitor.nextInt();
            System.out.println("Digite o valor de Y: ");
            y = leitor.nextInt();
        }

        if ( x > y){
            System.out.println("X é o número maior.");
        } else {
            System.out.println(" Y é o número maior.");
        }
   }
}