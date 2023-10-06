package aula_2;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {

        Scanner entrada;
        float dist;
        float litros;
        float media;

        entrada = new Scanner(System.in);

        System.out.println("Informe a distancia percorrida:");
        dist = entrada.nextFloat();
        System.out.println("Informe a quantidade de litros de combustivel gasto:");
        litros = entrada.nextFloat();

        media = dist/litros;

        System.out.println("A media de consumo do veiculo é de " + media +"km por litro");
    }
}