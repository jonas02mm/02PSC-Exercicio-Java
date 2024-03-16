import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("informe o tamanho do arquivo em MB: ");
        double tamanhoArquivoMB = scanner.nextDouble();
        System.out.println("informe a velocidade do link da internet em Mbps : ");
        double velocidadeMpbs = scanner.nextDouble();
        double velocidadeMBps = velocidadeMpbs / 8;
        double tempoSegundos = tamanhoArquivoMB / velocidadeMBps;
        double tempoMinutos = tempoSegundos / 60;
        System.out.println(" O tempo total necessario para o download é de aproximadamente " + tempoMinutos + "minutos.");
        

    }
}