package aula_4;

import java.util.Scanner;

public class aula_4 {

    public static void main(String[] args){

    double valorMaca = 1.30;
    double nCompra ;

        Scanner valor = new Scanner (System.in);

        System.out.println("Quantas maçãs você deseja comprar?");
        nCompra = valor.nextInt();

        double soma = valorMaca * nCompra;

        if (nCompra >= 10)
        {
            int valorMaca2 = 1;
            double soma2 = valorMaca2 * nCompra;

            System.out.println("O valor total do seu pedido é: R$"+soma2);
        }
        else {
            System.out.println("O valor total do seu pedido é: R$"+soma);
        }
    }

}
