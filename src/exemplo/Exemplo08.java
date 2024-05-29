package exemplo;
import java.util.Scanner;

public class Exemplo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para saber seu sucessor: ");
        int numero = sc.nextInt(); 
        int antecessor = numero + 1;
        System.out.println("O sucessor do seu numero é: " + antecessor);
        sc.close();
    }
}