package exemplo;
import java.util.Scanner;

public class Exemplo04 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o primeiro numero: ");
		int valor1= sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int valor2 = sc.nextInt();
		int resposta = valor1 - valor2;
		System.out.println("O resultado da subtração é: " + resposta);
		sc.close();
	}
}
