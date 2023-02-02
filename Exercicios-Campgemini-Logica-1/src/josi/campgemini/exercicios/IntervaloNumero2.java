package josi.campgemini.exercicios;

import java.util.Scanner;

/*Faça um algoritmo que receba um número e diga se este número está 
no intervalo entre 100 e 200 */

public class IntervaloNumero2 {

    public static void main(String[] args){

        int x;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            x = leitor.nextInt();
        }

        if ( x >= 100 && x <= 200){
            System.out.println("O número informado está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número não está no intervalo entre 100 e 200. ");
        }


    
    }
}