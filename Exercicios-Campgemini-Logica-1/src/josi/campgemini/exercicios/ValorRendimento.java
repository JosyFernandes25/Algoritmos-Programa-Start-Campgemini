package josi.campgemini.exercicios;

import java.util.Scanner;

/*Faça um algoritmo que receba um valor que foi depositado e exiba o valor com 
rendimento após um mês.Considere fixo o juro da poupança em 0,07% a. m. */

public class ValorRendimento {
    public static void main(String[] args){

        Double valorDeposito;
        Double rendimento;
        Double rendimentoMes;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o valor depositado: ");
            valorDeposito = leitor.nextDouble();
        }
        rendimento = (0.07 * valorDeposito)/100;
        rendimentoMes = valorDeposito + rendimento;

        System.out.println("O valor da sua conta era de "+ valorDeposito + ". Agora é de : " + rendimentoMes);
    
}
}