package josi.campgemini.exercicios;

import java.util.Scanner;

/*Faça um algoritmo que receba “N” números e mostre positivo, 
negativo ou zero para cada número */

public class NumeroPositivoNegativo {

    public static void main(String[] acrgs){

    int N;
    int X;

    try (Scanner leitor = new Scanner(System.in)) {
        System.out.println(" Quantos números você irá digitar: ");
        N = leitor.nextInt();

        int i= 0;
        for ( i =0; i < N; i++){
            System.out.println("Digite um número: ");
            X = leitor.nextInt();

            if (X > 0){
                System.out.println( "Seu número é positivo: "+ X);
            } else
            if ( X == 0){
                System.out.println(" Seu número é zero.");
            } else {
                System.out.println("Seu número é negativo: "+ X);
            } 
         }
    } 
   } 
}
