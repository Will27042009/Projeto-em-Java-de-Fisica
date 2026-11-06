import java.util.Scanner;

public class Pressao {

    public static void executar(Scanner ler) {

        double forca, area, resultado;

        System.out.println("===== Pressao =====");
        System.out.print("Digite a forca em N: ");
        forca = ler.nextDouble();

        System.out.print("Digite a area em m2: ");
        area = ler.nextDouble();

        resultado = forca / area;

        System.out.println("Formula: P = F / A");
        System.out.println("Resultado: " + resultado + " Pa");
    }
}
