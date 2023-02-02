package josi.campgemini.exercicios;

import java.util.Scanner;

/*Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) 
de um valor lido em dólar (US$). 
O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares 
disponíveis com o usuário */

public class CotacaoDolar {
    
    public static void main(String[] args){
        Double valorDisponivel;
        Double cotacaoDolar;
        Double conversaoReal;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Valor disponível em dólares para conversão: ");
            valorDisponivel = leitor.nextDouble();
            System.out.println("Cotação atual do dóllar: ");
            cotacaoDolar = leitor.nextDouble();
        }
        conversaoReal= valorDisponivel * cotacaoDolar;

        System.out.println("Sua conversão gerou "+ conversaoReal+ "reais.");


}
}
