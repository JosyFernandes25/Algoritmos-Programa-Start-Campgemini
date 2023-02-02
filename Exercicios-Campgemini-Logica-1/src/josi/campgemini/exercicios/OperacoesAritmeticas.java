package josi.campgemini.exercicios;

import java.util.Scanner;

/*Faça um algoritmo que receba dois números e ao final mostre a soma, 
 * subtração, multiplicação e divisão dos dois números lidos.
 */

public class OperacoesAritmeticas {
        int x;
        int y;
        int soma= x + y;
        int subtracao= x - y;
        int divisao= x/y;
        int multiplicacao = x * y;
    public static void main(String[] args){

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int x =leitor.nextInt();
            System.out.println("Digite outro número: ");
            int y=leitor.nextInt();

            int soma= x + y;
            int subtracao= x - y;
            int divisao= x/y;
            int multiplicacao = x * y;

            System.out.println("A soma é " + soma + ","+ "a subtração é "+ subtracao +
            ","+ "a divisão é "+ divisao+ ","+ " e a multiplicação é "+ multiplicacao + ".");
        }
    }
    
}
