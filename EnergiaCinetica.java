import java.util.Scanner;

public class EnergiaCinetica {

    public static void executar(Scanner ler) {

        double massa, velocidade, resultado;

        System.out.println("===== Energia cinetica =====");
        System.out.print("Digite a massa em kg: ");
        massa = ler.nextDouble();

        System.out.print("Digite a velocidade em m/s: ");
        velocidade = ler.nextDouble();

        resultado = massa * velocidade * velocidade / 2;

        System.out.println("Formula: Ec = M * V2 / 2");
        System.out.println("Resultado: " + resultado + " J");
    }
}
