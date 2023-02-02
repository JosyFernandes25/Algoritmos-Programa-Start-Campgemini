package josi.campgemini.exercicios;

import java.util.Scanner;

/*Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo
e o total de vendas efetuadas por ele no mês (em dinheiro).
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */

public class SalarioComissao {

    String nome;
    Double salariofixo;
    Double totalVendas;
    Double comissaovendas;
    
    public static void main(String[] args){

    String nome;
    Double salariofixo;
    Double totalVendas;
    Double comissaovendas;
    Double salarioFinal;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            nome = leitor.next();
            System.out.println("Digite seu sálario :");
            salariofixo = leitor.nextDouble();
            System.out.println("Digite seu total de vendas em dinheiro: ");
            totalVendas = leitor.nextDouble();
        }

        comissaovendas = (15 * totalVendas)/ 100; /* Fórmula porcentagem:
        Valor da porcentagem * valor analisado / 100 */
        salarioFinal = salariofixo + comissaovendas;


        System.out.println("Vendedor "+ nome+ " , "+ " Salário fixo "+ salariofixo+
        " " + " e" + " Salário final " + salarioFinal);

    }
}