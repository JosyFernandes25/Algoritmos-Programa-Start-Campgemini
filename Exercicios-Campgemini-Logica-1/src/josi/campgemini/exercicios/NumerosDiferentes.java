package josi.campgemini.exercicios;

import java.util.Scanner;

/* Faça um algoritmo que leia dois números e identifique se são iguais 
ou diferentes. Caso eles sejam iguais imprima uma mensagem
dizendo que eles são iguais. Caso sejam diferentes,
informe qual número é o maior, e uma mensagem que são diferentes*/


public class NumerosDiferentes {

    public static void main(String[] acrgs){

        int X;
        int Y;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o valor do primeiro número: ");
            X = leitor.nextInt();
            System.out.println("Digite o valor do segundo número: ");
            Y = leitor.nextInt();
        }

        if (X == Y){    
            System.out.println("Os números informados são iguais. ");
        } else
        if ( X > Y){
            System.out.println("Os números são diferentes e o primeiro é o maior: "+ X);
        }else {
            System.out.println("Os números são diferentes e o segundo é o maior: "+ Y);
        }
    }
}