import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o peso atual em KG : ");
    double peso = scanner.nextDouble();
    System.out.println("digite a altura em centimetros : ");
    double alturaCm = scanner.nextDouble();
    double alturaM = alturaCm / 100;
    double imc = peso / (alturaM * alturaM);
    System.out.println("seu imc é : + imc");
    double pesoIdeal = 22 * (alturaM * alturaM);
    double pesoIdealAjustado = 24.9 * ( alturaM * alturaM);
    System.out.println("seu peso ideial é : " + pesoIdeal + "KG");
    System.out.println("seu peso ideal ajustado é : "+ pesoIdealAjustado + "KG : ");




    }
}