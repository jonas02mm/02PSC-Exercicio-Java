import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora (HH:MM): ");
        String horarioDigitado= scanner.nextLine();

        String [] partesHora = horarioDigitado.split(" : ");
        int hora = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);

        if(hora < 0 || hora > 23 || minutos < 0 || minutos > 59){
            System.out.println("hora inválida.");
            return;
        }
        int minutosDesdeInicioDoDia = hora * 60 + minutos;
        System.out.println("Passaram-se " + minutosDesdeInicioDoDia + "minutos desde o inicio do dia. ");
    }
}