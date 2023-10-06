package aula_3;

import java.util.Scanner;

public class aula_3 {

    public static void main(String[] args){

        int n1, n2;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        n1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2 = leitor.nextInt();

        if (n1 > n2)
        {
            System.out.println("O numero "+n1+" é maior que o numero "+n2);
        }
        else {
            System.out.println("O numero "+n2+" é maior que o numero "+n1);
        }

    }

}

