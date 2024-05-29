package exemplo;
import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para saber seu antecessor: ");
        int numero = sc.nextInt(); 
        int antecessor = numero - 1;
        System.out.println("O antecessor do seu numero é: " + antecessor);
        sc.close();
    }
}