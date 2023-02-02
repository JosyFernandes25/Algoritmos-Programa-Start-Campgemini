package josi.campgemini.exercicios;

import java.util.Scanner;


/*Faça um algoritmo que receba o preço de custo e o preço de venda de 40 
produtos. Mostre como resultado se houve lucro, prejuízo ou empate
para cada produto. Informe o valor de custo de cada produto, o valor 
de venda de cada produto, a média de preço de custo e do preço de venda; */

public class PrecoCustoVenda2{
public static void main(String[] args){

    int precoCusto =0;
    int precoVenda;
    int mediaCusto = 0;
    int mediaVenda = 0;
    int mediaFinalCusto = 0;
    int mediaFinalVenda= 0;



    try (Scanner leitor = new Scanner(System.in)) {
        int i = 0;
        for ( i= 0; i < 40; i ++){
            System.out.println("Digite o preço de custo: ");
            precoCusto = leitor.nextInt();
            System.out.println("Digite o preço de venda: ");
            precoVenda = leitor.nextInt();


            if(precoCusto > precoVenda){
                System.out.println("Valor de Custo é "+ precoCusto+ ", valor de venda é "+ precoVenda+ " :Prejuízo." );
            } else
            if (precoVenda > precoCusto ){
                System.out.println("Valor de Custo é "+ precoCusto+ ", valor de venda é "+ precoVenda+ " :Lucro. ");
            }else {
                System.out.println("Valor de Custo é "+ precoCusto+ ", valor de venda é "+ precoVenda+" :Empate. ");
            }
            /*CALCULO PARA MÉDIAS DE CUSTO E VENDAS. */
           mediaCusto = mediaCusto + precoCusto;/*variavel para a soma */
           mediaFinalCusto = mediaCusto / 40;/* apos somar, divida. */
           mediaVenda = mediaVenda + precoVenda;
           mediaFinalVenda = mediaVenda /40;
        }
    }
    System.out.println("A média de preço de Custo é :"+ mediaFinalCusto);
    System.out.println("A média de preço de Venda é :"+ mediaFinalVenda);
   }
}