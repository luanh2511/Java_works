package exercicio_05;

public class multiplos_de_3_entre_1_e_100 {

    public static void main(String[] args) {

        System.out.println("Multiplos de 3:");
        for (int i = 0; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
