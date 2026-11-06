import java.util.Scanner;

public class PotenciaMedia {

    public static void executar(Scanner ler) {

        double trabalho, tempo, resultado;

        System.out.println("===== Potencia media =====");
        System.out.print("Digite o trabalho em joules: ");
        trabalho = ler.nextDouble();

        System.out.print("Digite o tempo em segundos: ");
        tempo = ler.nextDouble();

        resultado = trabalho / tempo;

        System.out.println("Formula: P = T / tempo");
        System.out.println("Resultado: " + resultado + " W");
    }
}
