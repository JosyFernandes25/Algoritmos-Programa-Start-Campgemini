package josi.campgemini.exercicios;

import java.util.Scanner;


/*A concessionária de veículos “CARANGO” está vendendo os seus veículos 
com desconto. Faça um algoritmo que calcule e exiba o valor do desconto
e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre 
o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 
21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados.
Informe total de desconto e total pago pelos clientes */

public class DescontoVeiculo2 {

    public static void main(String[] acrgs){

        int valorDesconto = 0;
        int valorFinalPago= 0;
        int valorVeiculo= 0;
        int combustível=0;

            try (Scanner leitor = new Scanner(System.in)) {

                    System.out.println("Informe o valor do veículo: ");
                    valorVeiculo = leitor.nextInt();
                    System.out.println("Informe o tipo de combustível: (1) Gasolina / (2) Alcool / (3) Diesel.");
                    combustível = leitor.nextInt();
   

                while ( valorVeiculo != 0) {
                if (combustível == 1){
                valorDesconto = ( 21 * valorVeiculo)/100;
                } else
                if (combustível == 2){
                    valorDesconto = (25 * valorVeiculo)/100;
                } else 
                if (combustível == 3){
                    valorDesconto = (14* valorVeiculo)/100;
                }
                    System.out.println("Informe o valor do veículo: ");
                    valorVeiculo = leitor.nextInt();
                    System.out.println("Informe o tipo de combustível: (1) Gasolina / (2) Alcool / (3) Diesel.");
                    combustível = leitor.nextInt();
             
              valorFinalPago = valorVeiculo - valorDesconto;
              System.out.println("Seu veículo sairá pelo valor final de: "+ valorFinalPago);
      }
    } 
   }
}