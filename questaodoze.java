import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("digite a potencia do equipamento em watts: ");
        double potencia = scanner.nextDouble();
        System.out.print("digite a qauntidade de horas que o equipamento fica ligado por dia : ");
        double horasPorDia = scanner.nextDouble();
        System.out.print("digite o valor do kWh em rais : ");
        double valorKWh = scanner.nextDouble();
        double consumoDiario = (potencia * horasPorDia) / 1000;
        double consumoMensal = consumoDiario * 30;
        double custoMensal = consumoMensal * valorKWh;
        System.out.printf("O equipamento consome &.2f kWh por dia.%n", consumoDiario);
        System.out.printf("O equipamento cosnumá aproximadamente &.2f kWh por mês.%n", consumoMensal);
        System.out.printf("O custo mensal para utuilizar o equipamento será de R$ %.2f%n", custoMensal);
        scanner.close();
    }
}