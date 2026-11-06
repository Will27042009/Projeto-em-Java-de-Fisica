import java.util.Scanner;

public class Torricelli {

    public static void executar(Scanner ler) {

        double velocidadeInicial, aceleracao, distancia, resultado;

        System.out.println("===== Equacao de Torricelli =====");
        System.out.print("Digite a velocidade inicial: ");
        velocidadeInicial = ler.nextDouble();

        System.out.print("Digite a aceleracao: ");
        aceleracao = ler.nextDouble();

        System.out.print("Digite a distancia: ");
        distancia = ler.nextDouble();

        resultado = Math.sqrt(velocidadeInicial * velocidadeInicial + 2 * aceleracao * distancia);

        System.out.println("Formula: V2 = Vi2 + 2 * A * distancia");
        System.out.println("Resultado: " + resultado + " m/s");
    }
}
