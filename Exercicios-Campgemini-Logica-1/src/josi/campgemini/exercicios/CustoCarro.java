package josi.campgemini.exercicios;

import java.util.Scanner;

/*O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual
do distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre 
o custo de fábrica, e depois o percentual do distribuidor sobre o resultado).
Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, 
escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao 
consumidor do mesmo */

public class CustoCarro {
    public static void main(String[] args){

        Double percentualDistribuidor;
        Double percentualImposto;
        Double imposto;
        Double custoFabrica;
        Double custoFinal;

        try (Scanner leitor = new Scanner (System.in)) {
            System.out.println("Digite o custo de fábrica: ");
            custoFabrica = leitor.nextDouble();
        }
        percentualImposto = ( 45 * custoFabrica)/100;
        imposto = custoFabrica + percentualImposto;
        percentualDistribuidor = (28 * imposto)/100;
        custoFinal = imposto + percentualDistribuidor;

        System.out.println("O custo final de seu carro é: "+ custoFinal);

        

    
}
}