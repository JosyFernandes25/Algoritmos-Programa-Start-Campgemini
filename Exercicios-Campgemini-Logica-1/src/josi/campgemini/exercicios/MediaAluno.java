package josi.campgemini.exercicios;

import java.util.Scanner;

/*Escreva um algoritmo que leia o nome de um aluno e as notas das 
três provas que ele obteve no semestre. 
No final informar o nome do aluno e a sua média (aritmética) */

public class MediaAluno {

    String nome;
    Double nota1;
    Double nota2;
    Double nota3;
    Double mediaNota;

    public static void main(String[] args){

        String nome;
        Double nota1;
        Double nota2;
        Double nota3;
        Double mediaNota;

        try (Scanner leitor = new Scanner (System.in)) {
            System.out.println("Digite seu nome: ");
            nome = leitor.next();
            System.out.println("Digite sua primeira nota: ");
            nota1 = leitor.nextDouble();
            System.out.println("Digite sua segunda nota: ");
            nota2 = leitor.nextDouble();
            System.out.println("Digite sua terceira nota: ");
            nota3 = leitor.nextDouble();
        }

        mediaNota = (nota1 + nota2 + nota3) / 3;

        System.out.println( nome + " ,"+ "sua média final é: " + mediaNota);
   
}
}