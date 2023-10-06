package Atividade_02;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        Atividade_02.Conversao conversao = new Conversao();
        double tempCrecebido = scan.nextDouble();
        double tempFcalculado =
                conversao.ConvertFahrenheint(tempCrecebido);
        System.out.println("O valor em F: "+
                tempFcalculado);
        scan.close();
    }
}