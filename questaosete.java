import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a largura da área a ser revestida (em metros):");
        double larguraArea = scanner.nextDouble();
        System.out.println("Informe o comprimento da área a ser revestida (em metros):");
        double comprimentoArea = scanner.nextDouble();
        System.out.println("Informe a largura da cerâmica escolhida (em centímetros):");
        double larguraCeramica = scanner.nextDouble();
        System.out.println("Informe o comprimento da cerâmica escolhida (em centímetros):");
        double comprimentoCeramica = scanner.nextDouble();
        System.out.println("Informe o valor do metro quadrado da cerâmica escolhida:");
        double valorMetroQuadradoCeramica = scanner.nextDouble();
        double areaCeramica = (larguraCeramica / 100) * (comprimentoCeramica / 100);
        double areaTotal = larguraArea * comprimentoArea;
        double quantidadeCeramica = Math.ceil((areaTotal / areaCeramica) * 1.1);
        double valorTotal = quantidadeCeramica * valorMetroQuadradoCeramica * areaCeramica;
        System.out.println("Quantidade de cerâmica necessária: " + quantidadeCeramica + " peças.");
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
    }
}