package josi.campgemini.exercicios;
/*. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se 
ela é homem ou mulher.
No final informe total de homens e de mulheres */

import java.util.Scanner;

public class NomeESexo {
    public static void main(String[] args){
        
        String nome;
        int sexo =0;
        int somaFeminino =0;
        int somaMasculino =0;
        
        try (Scanner leitor = new Scanner (System.in)) {
            int i=0;
            for (i =0; i< 56; i++){

            System.out.println("Digite seu nome: ");
            nome= leitor.next();
            System.out.println("Digite seu sexo: (1)Feminino ou (2) Masculino: ");
            sexo= leitor.nextInt();

            if ( sexo == 1){
                somaFeminino = somaFeminino + 1;
                System.out.println(nome + ", sexo Feminino.");
            } else {
                somaMasculino = somaMasculino +1;
                System.out.println(nome + ", sexo Masculino.");
            } 
   }
        }

        System.out.println("Total de pessoas do sexo Feminino: "+ somaFeminino);
    System.out.println("Total de pessoas do sexo Masculino: "+ somaMasculino);
   
        }
    }