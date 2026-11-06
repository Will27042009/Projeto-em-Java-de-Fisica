import java.util.Scanner;

public class VelocidadeMedia {

    public static void executar(Scanner ler) {

        double distancia, tempo, resultado;

        System.out.println("===== Velocidade media =====");
        System.out.print("Digite a distancia em metros: ");
        distancia = ler.nextDouble();

        System.out.print("Digite o tempo em segundos: ");
        tempo = ler.nextDouble();

        resultado = distancia / tempo;

        System.out.println("Formula: Vm = distancia / tempo");
        System.out.println("Calculo: " + distancia + " / " + tempo);
        System.out.println("Resultado: " + resultado + " m/s");
    }
}
