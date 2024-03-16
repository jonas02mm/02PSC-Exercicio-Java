import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o comprimento cateto (a): ");
        double a = scanner.nextDouble();

        System.out.println("digite o comprimento do cateto (b): ");
        double b = scanner.nextDouble();

        double aQuadrado = Math.pow(a,2);
        double bQuadrado = Math.pow(b,2);
        double cQuadrado = aQuadrado + bQuadrado;
        double c = Math.sqrt(cQuadrado);

        System.out.println("o comprimento da hipotenusa é : " + c);

    }
}