package exercicio_06;

import java.util.Scanner;

public class valor_fatorial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int n, fatorial = 1;
        int x = 1;

        do{
            System.out.println("Digite um numero: ");
            n = leitor.nextInt();

            for(int i = 1; i <= n; i++){
                fatorial = fatorial * i;
            }

            System.out.println("Fatorial de " + n + " é igual á: " + fatorial);
            x++;

        }while(x < 2);
    }
}