import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = s.next();
		
		if (nome.equals("pedro")) {
			System.out.println("Pobre maldito!");
			
		}else {
			System.out.println("Belo nome!");
		}
		
	}
}
