package josi.campgemini.exercicios;

import java.util.Scanner;

/*. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com 
desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor
a ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano
do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja
continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral */

public class DescontoAnoCarro {
    public static void main(String[] args){

        Double valorDesconto;
        Double valorPago;
        int anoVeiculo;
        Double valorVeiculo;  
        int simNao = 0;   
        int totalAte2000 =0;
        int totalAcima2000 =0; 
        int totalRegistrosCarros =0;            


        try (Scanner leitor = new Scanner (System.in)) {
            while ( simNao != 2) {

            System.out.println(" Qual o valor do veículo: ");
            valorVeiculo = leitor.nextDouble();
            System.out.println(" Informe o ano do veículo: ");
            anoVeiculo = leitor.nextInt();

            if ( anoVeiculo <= 2000){
                valorDesconto = ( 12 * valorVeiculo)/ 100;
            } else {
                valorDesconto = ( 7 * valorVeiculo)/100;
            }
            valorPago = valorVeiculo - valorDesconto;

            if ( anoVeiculo <= 2000){
                totalAte2000 = totalAte2000 + 1;
            } else {
            totalAcima2000 = totalAcima2000 + 1;
   }
            totalRegistrosCarros = totalAte2000 + totalAcima2000;

            System.out.println( "Seu veículo sairá pelo valor de :"+ valorPago);

            System.out.println("Deseja continuar calculando descontos: (1) Sim/ (2) Não" );
            simNao = leitor.nextInt();
   }
        }

        System.out.println("O total de carros com ano até 2.000 é: " + totalAte2000); 
    System.out.println("O total de carros registrados é: " + totalRegistrosCarros);
   }
}