import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" digite a potencia do equipamento em watts : ");
        double potenciaWatts = scanner.nextDouble();
        System.out.println("digite a quantidade de horas que o equiapmento fica ligado por dia : ");
        double horasPorDia = scanner.nextDouble();
        System.out.println("digite o valor do kWh (em reais) : ");
        double valorkWh = scanner.nextDouble();
        double kWhConsumidos = (potenciaWatts * horasPorDia) / 1000;
        double valorPago =  kWhConsumidos * valorkWh;
        System.out.println("quantidade de kWh consumidos : " + kWhConsumidos + "kWh");
        System.out.println("valor pago : R$ " + valorPago);

    }
}