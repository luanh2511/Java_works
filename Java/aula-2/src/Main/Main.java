package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double produto, calcular;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o produto:");
        produto = leitor.nextDouble();
        calcular = (produto * 0.90);
        System.out.println("O valor do produto é " + calcular);

    }
}