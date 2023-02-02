package josi.campgemini.exercicios;

import java.util.Scanner;

/* Escreva um algoritmo para uma empresa que decide dar um reajuste a 
seus 584 funcionários de acordo com os seguintes critérios:  
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos; 
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
Calcule o seu novo salário reajustado. Escrever o nome do funcionário,
o reajuste e seu novo salário. Calcule quanto à empresa 
vai aumentar sua folha de pagamento*/

public class ReajusteFuncionario {

    public static void main(String[] acrgs){

        Double salarioMinino;
        Double salarioFuncionario;
        Double salarioReajustado;
        Double reajuste;
        String nome;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            nome = leitor.next();
            System.out.println("Digite seu salário: ");
            salarioFuncionario = leitor.nextDouble();
            System.out.println("Digite o valor do salário mínimo: ");
            salarioMinino = leitor.nextDouble();
        }

        if (salarioFuncionario < (salarioMinino * 3)){
            reajuste = ( 50 * salarioFuncionario)/100;
            salarioReajustado = salarioFuncionario + reajuste;
            System.out.println(nome + ", seu salário teve reajuste de "+ reajuste+ " , e agora é: "+ salarioReajustado);
        }else
        if (salarioFuncionario > (salarioMinino *3) && salarioFuncionario < (salarioMinino *10)){
            reajuste = ( 20 * salarioFuncionario)/100;
            salarioReajustado = salarioFuncionario + reajuste;
            System.out.println(nome + ", seu salário teve reajuste de "+ reajuste+ " , e agora é: "+ salarioReajustado);
        }else 
        if (salarioFuncionario > (salarioMinino * 10) && salarioFuncionario < (salarioMinino *20)){
            reajuste = ( 15 * salarioFuncionario)/100;
            salarioReajustado = salarioFuncionario + reajuste;
            System.out.println(nome + ", seu salário teve reajuste de "+ reajuste+ " , e agora é: "+ salarioReajustado);
        }else {
            reajuste = ( 10 * salarioFuncionario)/100;
            salarioReajustado = salarioFuncionario + reajuste;
            System.out.println(nome + ", seu salário teve reajuste de "+ reajuste+ " , e agora é: "+ salarioReajustado);
        }
        System.out.println("Com o reajuste desse funcionário a empresa aumentará em sua folha de pagamento: "+ reajuste);
    }
}