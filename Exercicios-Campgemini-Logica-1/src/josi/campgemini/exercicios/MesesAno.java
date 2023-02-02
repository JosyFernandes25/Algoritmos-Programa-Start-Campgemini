package josi.campgemini.exercicios;

import java.util.Scanner;

/* Faça um algoritmo que receba o número do mês e mostre o
mês correspondente. Valide mês inválido; */

public class MesesAno {

    public static void main(String[] acrgs){

        int mesAno;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite números de 1 a 12 para busca do mês do ano pretendido: ");
            mesAno = leitor.nextInt();
        }

        switch (mesAno){
            case 1: System.out.println("Janeiro.");
            break;
            case 2: System.out.println("Fevereiro.");
            break;
            case 3: System.out.println("Março.");
            break;
            case 4: System.out.println("Abril.");
            break;
            case 5: System.out.println("Maio.");
            break;
            case 6: System.out.println("Junho.");
            break;
            case 7: System.out.println("Julho.");
            break;
            case 8: System.out.println("Agosto.");
            break;
            case 9: System.out.println("Setembro.");
            break;
            case 10: System.out.println("Outubro.");
            break;
            case 11: System.out.println("Novembro.");
            break;
            case 12: System.out.println("Dezembro.");
            break;
            default: System.out.println("Número inválido.");
        } 
    }
    
}
