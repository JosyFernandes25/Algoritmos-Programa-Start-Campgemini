package josi.campgemini.exercicios;

import java.util.Scanner;

/*Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. 
Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações */

public class PrestacaoSemJuros {

    public static void main(String[] args){

        Double valorCompra;
        Double valorPrestacao;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o valor da sua compra: ");
            valorCompra = leitor.nextDouble();
        }
        valorPrestacao = valorCompra / 5;

        System.out.println("Suas prestações sairão no valor de "+ valorPrestacao+ " reais sem juros.");



    
}
}