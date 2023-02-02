package josi.campgemini.exercicios;

import java.util.Scanner;

/* Escreva um algoritmo que leia três valores inteiros distintos e os 
escreva em ordem crescente;
*/

public class OrdemCrescente {

    public static void main(String[] acrgs){
        
        int X;
        int Y;
        int Z;
        try (Scanner leitor = new Scanner (System.in)) {
            System.out.println("Digite o primeiro número: ");
            X = leitor.nextInt(); 
            System.out.println("Digite o segundo número: ");
            Y = leitor.nextInt();
            System.out.println("Digite o terceiro número: ");
            Z = leitor.nextInt();
        }

        if( X < Y && Y < Z){
            System.out.println("Crescente: "+ X +" "+ Y+" "+ Z+ ".");
        }else {
            System.out.println("Não é ordem crescente: "+ X +"  "+  Y +"  "+ Z + ".");
        }
      }
   }