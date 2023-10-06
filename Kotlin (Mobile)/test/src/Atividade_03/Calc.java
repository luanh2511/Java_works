package Atividade_03;

public class Calc {
    public double calcularValorCorrida(double distancia, int diaSemana) {
        double valorBandeira = (diaSemana == 2) ? 8.00 : 4.00;
        return valorBandeira + 10 * distancia;
    }
}

