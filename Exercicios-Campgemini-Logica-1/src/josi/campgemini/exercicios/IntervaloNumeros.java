package josi.campgemini.exercicios;
/*Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo 
entre 10 (inclusive) e 150 (inclusive) */

import java.util.Scanner;

public class IntervaloNumeros {
     public static void main(String[] args){ 

        int x ;
        int i;
        int soma = 0;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            x = leitor.nextInt();
            
            for (i = 0; i< 80; i++){
                if ( x >= 10 && x <= 150){
                    soma = soma + 1;
                }
            System.out.println( "Digite outro número: ");
            x = leitor.nextInt();
            }
        }
        
        System.out.println(" Quantidade de números digitados entre 10 e 150: "+soma);
    }
    
}
