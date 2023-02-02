package josi.campgemini.exercicios;

import java.util.Scanner;

/* Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. 
Sabe-se que o cálculo da conta de 
luz segue a tabela abaixo: 

Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29*/

public class CalculoEnergia {

    public static void main(String[] args){

        
        Double kwResidencia;
        Double kwComercio;
        Double kwIndustria;
        int X;
        Double kWHora;


        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite sua unidade consumidora: (1) Residência, (2) Comércio, (3) Indústria.");
            X = leitor.nextInt();
            System.out.println("Digite quantidade de KW/h são consumidos:");
            kWHora = leitor.nextDouble();
        }

        kwResidencia = (0.60 * kWHora) * 24;/*calculo para consumo em 24 hrs */
        kwComercio = (0.48 * kWHora) * 24;
        kwIndustria = (1.29 * kWHora)* 24;

        switch (X){
            case 1:
            System.out.println(" Sua conta de Luz desse mês é: "+ kwResidencia * 30);
            break;
            case 2:
            System.out.println("Sua conta de luz desse mês é: "+ kwComercio * 30);
            break;
            case 3:
            System.out.println("Sua conta de luz desse mês é: "+ kwIndustria * 30);
        }
     }
}