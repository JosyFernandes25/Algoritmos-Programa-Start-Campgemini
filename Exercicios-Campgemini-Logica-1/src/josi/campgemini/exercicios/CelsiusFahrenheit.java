package josi.campgemini.exercicios;

import java.util.Scanner;

/* Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
A fórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit
 e C a temperatura em Celsius  */ 

public class CelsiusFahrenheit {

    public static void main(String[] args){

        Double Celsius;
        Double Fahrenheit;
        Double conversao;

        try (Scanner leitor = new Scanner (System.in)) {
            System.out.println("Digite a temperatura em graus Celsius: ");
            Celsius = leitor.nextDouble();
        } 
            conversao = (9 * Celsius + 160)/5;
        Fahrenheit = conversao;

        System.out.println("Sua tempertura em Fahrenheit é: "+ Fahrenheit);

    
}
}
