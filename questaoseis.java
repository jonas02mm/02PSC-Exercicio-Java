import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" informa a largura da area a ser revestida (em metros): ");
        double larguraArea = scanner.nextDouble();
        System.out.println(" informa a comprimento da area a ser revestida (em metros): ");
        double comprimentoArea = scanner.nextDouble();
        System.out.println(" informa a largura da ceramica escolhida (em centimetros): ");
        double larguraCeramica = scanner.nextDouble();
        System.out.println(" informa a comprimento da ceramica escolhida (em centimetros): ");
        double comprimentoCeramica = scanner.nextDouble();
        double areaCeramica = (larguraCeramica / 100 ) * (comprimentoCeramica / 100);
        double areaTotal = larguraArea * comprimentoArea;
        double quantidadeCeramica =  Math.ceil((areaTotal/areaCeramica) * 1.1);
        System.out.println("quatidade de ceramica necessaria: " + quantidadeCeramica + "peças.");


    }
}