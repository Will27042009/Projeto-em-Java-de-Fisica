import java.util.Scanner;

public class Trabalho {

    public static void executar(Scanner ler) {

        double forca, distancia, resultado;

        System.out.println("===== Trabalho de uma forca =====");
        System.out.print("Digite a forca em N: ");
        forca = ler.nextDouble();

        System.out.print("Digite a distancia em metros: ");
        distancia = ler.nextDouble();

        resultado = forca * distancia;

        System.out.println("Formula: T = F * D");
        System.out.println("Resultado: " + resultado + " J");
        System.out.println("Considerando a forca na mesma direcao do movimento.");
    }
}
