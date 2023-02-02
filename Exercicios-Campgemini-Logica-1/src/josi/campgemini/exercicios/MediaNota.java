package josi.campgemini.exercicios;

import java.util.Scanner;

/* Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o 
semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado
(media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9) */

public class MediaNota {

    public static void main(String[] args){

        String nome;
        Double nota1;
        Double nota2;
        Double nota3;
        Double mediaNota;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            nome = leitor.next();
            System.out.println("Digite a primeira nota: ");
            nota1 = leitor.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = leitor.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota3 = leitor.nextDouble();
        }

        mediaNota = (nota1 + nota2 + nota3)/ 3;

        if ( mediaNota >= 7){
            System.out.println("Aluno" + nome + ", APROVADO.");
        } else
        if ( mediaNota >= 5.1  &&  mediaNota <= 6.9){
            System.out.println("Aluno: "+ nome + ", EM RECUPERAÇÃO.");
        } else {
            System.out.println( "Aluno: " + nome + ", REPROVADO.");
        }
    
     }
}