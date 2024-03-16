import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor da base do retangulo: ");
        double base = scanner.nextDouble();
        System.out.println(" digite o valor da altura do retangulo: ");
        double altura = scanner.nextDouble();
        double area =  base * altura;
        double perimetro =  2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        System.out.println("area do retangulo : " + area);
        System.out.println("perimetro do retangulo : " + perimetro);
        System.out.println("diagonal do retangulo : " + diagonal);

    }
}