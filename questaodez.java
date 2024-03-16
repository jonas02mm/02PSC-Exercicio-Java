import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite o peso da em KG : ");
        double peso = scanner.nextDouble();
        double aguaRecomendadaLitros = peso * 0.035;
        System.out.println(" A quantidade recomendada de agua é: " + aguaRecomendadaLitros + "litros por dia." );

    }
}