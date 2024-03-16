import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numerador da primeira fração: ");
        int numerador1 = scanner.nextInt();
        System.out.println("digite o denominador da primeira fração: ");
        int denominador1 = scanner.nextInt();
        System.out.println("digite o numerador da segunda fração: ");
        int numerador2 = scanner.nextInt();
        System.out.println("digite o denominador da segunda fração: ");
        int denominador2 = scanner.nextInt();
        int novoNumerador = numerador1 * denominador2 + numerador2 * denominador1;
        int novoDenominador = denominador1 * denominador2;
        System.out.println("A soma das frações é: ");
        System.out.println(novoNumerador + "/" + novoDenominador);
        scanner.close();
    }
}