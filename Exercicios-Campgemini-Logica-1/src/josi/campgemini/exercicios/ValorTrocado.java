package josi.campgemini.exercicios;

import java.util.Scanner;

/*Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma 
que a variável A passe a possuir o valor da variável B e a variável B
possuir o valor da variável A.
Apresentar os valores trocados.  */

public class ValorTrocado {
    public static void main(String[] args){

        try (Scanner leitor = new Scanner (System.in)) {
            int A;
            int B;
            int auxiliar; /*Necessária para troca de valores, evita
            perda de dados */

            System.out.println("Digite o primeiro número: ");
            A = leitor.nextInt();
            System.out.println("Digite o segundo número: ");
            B = leitor.nextInt();

            /*ROTINA DE TROCA DE VALORES: */

            auxiliar = A;
            A = B;
            B = auxiliar;

            System.out.println("Variável A agora vale: "+ A);
            System.out.println("Variável B agora vale: "+ B);
        }
        
    
}
}
