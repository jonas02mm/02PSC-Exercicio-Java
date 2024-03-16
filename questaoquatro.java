import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" digite o primeiro valor da primeira proporção : ");
        double valorA1 = scanner.nextDouble();
        System.out.print(" digite o segundo valor da primeira proporção : ");
        double valorB1 = scanner.nextDouble();
        System.out.println("digite o valor da segunda proporção: ");
        double valorB2 = scanner.nextDouble();
        double valorA2 = (valorB2 * valorA1) / valorB1;
        System.out.println("O valor correspondente é : " + valorA2);


    }
}