import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1,n2,n3,media;
		
	System.out.println("Digite a primeira nota: ");
	n1 = s.nextInt();
	System.out.println("Digite a segunda nota: ");
	n2 = s.nextInt();
	System.out.println("Digite a terceira nota: ");
	n3 = s.nextInt();
	
	media = n1+n2+n3 /3;
	
	System.out.println("A sua m�dia �: "+media);
	
	}
}
