package josi.campgemini.exercicios;

import java.util.Scanner;

/*Escreva um algoritmo para determinar o consumo médio de um automóvel
sendo fornecida a distância total percorrida pelo automóvel
e o total de combustível gasto */

public class ConsumoMedioAutomovel {

    int combustívelGasto;
    int distanciaPercorrida;
  

    public static void main(String[] args){

        try (Scanner leitor = new Scanner (System.in)) {
            System.out.println("Digite a distancia percorrida: ");
            int distanciaPercorrida = leitor.nextInt();
            System.out.println("Digite o total de combustível gasto: ");
            int combustívelGasto = leitor.nextInt();

            int consumoMédio;

            consumoMédio = distanciaPercorrida/combustívelGasto;

            System.out.println("O consumo médio do automóvel é: "+ consumoMédio+ "km/L.");
        }
    }

        
    
}
