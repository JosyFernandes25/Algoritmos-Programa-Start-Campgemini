package josi.campgemini.exercicios;

import java.util.Scanner;

/* Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando 
“maior de idade” e “menor de idade” para cada pessoa.
Considere a idade a partir de 18 anos como maior de idade */


public class MenorMaiorIdade {

    public static void main(String[] args){

        int idade;
        int i;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            idade = leitor.nextInt();

            for (i = 0; i< 75; i++){
                if (idade < 18){
                    System.out.println("Menor de idade.");
                } else {
                    System.out.println("Maior de idade.");
                }
            System.out.println( "Digite outra idade: "); /*Deve-se pedir novamente a entrada para
            que o laço não fique preso em apenas o primeiro número informado no for. */ 
            idade = leitor.nextInt();
            }
        }
    }
}
