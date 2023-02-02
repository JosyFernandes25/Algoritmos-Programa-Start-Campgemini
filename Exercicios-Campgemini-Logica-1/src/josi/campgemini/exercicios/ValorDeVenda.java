package josi.campgemini.exercicios;

import java.util.Scanner;

/*Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
Sabe-se que o preço de custo receberá um acréscimo de 
acordo com um percentual informado pelo usuário;
 */

public class ValorDeVenda {
        int precoCusto;
        int percentual;
        int valorDeVenda;
        int calculoAcrescimo;

    public static void main(String[] args){

        int precoCusto;
        int percentual;
        int valorDeVenda;
        int calculoAcrescimo;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Informe o preço de custo: ");
            precoCusto = leitor.nextInt();
            System.out.println("Informe o percentual de acréscimo: ");
            percentual =leitor.nextInt();
        }
        
            calculoAcrescimo = (percentual * precoCusto)/100;/*cálculo para porcentagem */
        valorDeVenda = precoCusto + calculoAcrescimo;

        System.out.println("O valor de venda do produto é de "+ valorDeVenda+ " reais.");

   
}
}
