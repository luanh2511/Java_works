package Atividade_03;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância da corrida em quilômetros: ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite o dia da semana (1 para dias úteis, 2 para fins de semana): ");
        int diaSemana = scanner.nextInt();
        Calc calc = new Calc();
        double valorCorrida = calc.calcularValorCorrida(distancia, diaSemana);
        System.out.println("Valor da corrida: R$" + valorCorrida);
        scanner.close();
    }
}

