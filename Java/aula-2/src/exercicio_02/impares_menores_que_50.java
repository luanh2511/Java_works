package exercicio_02;

public class impares_menores_que_50 {

    public static void main(String[] args) {

        System.out.println("Valores Impares:");
        for (int i = 0; i < 50; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
