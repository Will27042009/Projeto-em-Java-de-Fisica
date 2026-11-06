import java.util.Scanner;

public class Densidade {

    public static void executar(Scanner ler) {

        double massa, volume, resultado;

        System.out.println("===== Densidade =====");
        System.out.print("Digite a massa em kg: ");
        massa = ler.nextDouble();

        System.out.print("Digite o volume em m3: ");
        volume = ler.nextDouble();

        resultado = massa / volume;

        System.out.println("Formula: D = M / V");
        System.out.println("Resultado: " + resultado + " kg/m3");
    }
}
