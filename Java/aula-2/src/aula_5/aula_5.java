package aula_5;

import java.util.Scanner;

public class aula_5 {

    public static void main(String[] args){

        Scanner sal = new Scanner(System.in);

        double salarioAtual;

        System.out.println("Digite seu salario atual:");
        salarioAtual = sal.nextDouble();

        double aumento1 = 12 * salarioAtual / 100 + salarioAtual;
        double aumento2 = 10 * salarioAtual / 100 + salarioAtual;
        double aumento3 = 7 * salarioAtual / 100 + salarioAtual;
        double aumento4 = 5 * salarioAtual / 100 + salarioAtual;

        if (salarioAtual <= 1500)
        {
            System.out.println("Você recebeu um aumento de 12%!");
            System.out.println("Seu novo salario é: R$"+aumento1);
        }
        else if (salarioAtual <= 1750)
        {
            System.out.println("Você recebeu um aumento de 10%!");
            System.out.println("Seu novo salario é: R$"+aumento2);
        }
        else if (salarioAtual <= 2000)
        {
            System.out.println("Você recebeu um aumento de 7%!");
            System.out.println("Seu novo salario é: R$"+aumento3);
        }
        else
        {
            System.out.println("Você recebeu um aumento de 5%!");
            System.out.println("Seu novo salario é: R$"+aumento4);
        }

    }

}
