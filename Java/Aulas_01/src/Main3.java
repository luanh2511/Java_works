import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int idade;
		String nome;
		float celular;
		double salario;
		
		System.out.println("Ol�, seja bem vindo(a).");
		System.out.println("Por favor, informe seus dados abaixo:");
		System.out.println("");
		System.out.println("Digite seu Nome: ");
		nome = s.nextLine();
		System.out.println("Digite sua idade: ");
		idade = s.nextInt();
		System.out.println("Digite seu Telefone: ");
		celular = s.nextFloat();
		System.out.println("Digite seu sal�rio atual: ");
		salario = s.nextDouble();
		
		System.out.println("Ol� "+nome+".");
		System.out.println("Com "+idade+" anos voc� recebe o sal�rio de R$ "+salario+" Reais.");
		System.out.println("Entraremos em contato pelo Telefone: "+celular+".");
		System.out.println("Obrigado pelo interesse!");
		
		
		
	
	}
}
