package josi.campgemini.exercicios;

import java.util.Scanner;

/* Exercicio 1: Crie um algoritmo que receba dois numeros e exiba
 * o resultado da sua soma.
 */
 
public class SomaDoisNumeros {

    int x;
    int y;

     public static void main(String[] args) {
    
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int x = leitor.nextInt();
            System.out.println ("Digite outro número :");
            int y = leitor.nextInt();

            int soma = x + y;

            System.out.println(" A soma dos números é: " + soma);
        }
    }
    
}
