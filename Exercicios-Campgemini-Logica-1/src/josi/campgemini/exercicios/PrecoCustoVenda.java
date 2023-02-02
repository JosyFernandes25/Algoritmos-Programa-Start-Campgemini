package josi.campgemini.exercicios;
/*Faça um algoritmo que receba um número e mostre uma mensagem caso este 
número sege maior que 80, menor que 25 ou igual a 40 */

import java.util.Scanner;


public class PrecoCustoVenda{

    public static void main(String[] args){
        int numero;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            numero = leitor.nextInt();
        }

        if ( numero > 80){
            System.out.println("O número digitado é maior que 80. ");

        } else
        if ( numero < 25){
            System.out.println("O número digitado é menor que 25 .");
        } else 
        if ( numero == 40){
            System.out.println("O número digitado é 40. ");
        }
   }
}