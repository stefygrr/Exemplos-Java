package exemplo;
import java.util.Scanner;

public class Exemplo03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o primeiro numero: ");
		int valor1= sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int valor2 = sc.nextInt();
		int resposta = valor1 + valor2;
		System.out.println("O resultado da soma é: " + resposta);
		sc.close();
	}
}



//System.out.println = Imprimindo na saída do sistema//