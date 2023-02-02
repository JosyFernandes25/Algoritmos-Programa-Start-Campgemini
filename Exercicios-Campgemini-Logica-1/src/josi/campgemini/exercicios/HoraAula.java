package josi.campgemini.exercicios;
/*  A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
Faça um algoritmo que calcule e exiba o salário de um professor.
Sabe-se que o valor da hora/aula segue a tabela abaixo: 
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
*/

import java.util.Scanner;

public class HoraAula {

    public static void main(String[] args){

        int qtdHoraAula;
        int nivelProfessor;
        int salarioProfessor;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite seu nível ( 1, 2 ou 3):");
            nivelProfessor = leitor.nextInt();
            System.out.println("Digite a quantidade de horas trabalhadas: ");
            qtdHoraAula = leitor.nextInt();
        }

        switch (nivelProfessor){
            case 1:
            salarioProfessor = qtdHoraAula * 12;
            System.out.println("Seu salário é: "+ salarioProfessor);
            break;
            case 2:
            salarioProfessor = qtdHoraAula * 17;
            System.out.println("Seu salário é: "+ salarioProfessor);
            break;
            case 3:
            salarioProfessor = qtdHoraAula * 25;
            System.out.println("Seu salário é: "+ salarioProfessor);

        }
      }
}