import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("digite o preço da gasolina: R$: ");
        double precoGasolina = scanner.nextDouble();

        System.out.print(" digite o preço do etanol: R$: ");
        double precoEtanol = scanner.nextDouble();

        double limitePrecoEtanol = 0.7 * precoGasolina;
        if (precoEtanol < limitePrecoEtanol) {
            System.out.println("é mais economico abastecer com etanol. ");
        } else {
            System.out.println("é mais economico abastecer com gasolina. ");
        }


    }
}