package josi.campgemini.exercicios;

import java.util.Scanner;

/*Faça um algoritmo que receba um número e mostre uma mensagem caso este 
número seja maior que 10 */

public class NumeroMaiorQue10 {

    public static void main(String[] args){

        int x;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            x = leitor.nextInt();
        }

        if (x > 10){
            System.out.println("Seu número é maior que 10.");
        } else {
            System.out.println("Seu número não é maior que 10.");
        }    
   }
}