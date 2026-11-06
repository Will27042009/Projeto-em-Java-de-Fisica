import java.util.Scanner;

public class AceleracaoMedia {

    public static void executar(Scanner ler) {

        double velocidadeInicial, velocidadeFinal, tempo, resultado;

        System.out.println("===== Aceleracao media =====");
        System.out.print("Digite a velocidade inicial: ");
        velocidadeInicial = ler.nextDouble();

        System.out.print("Digite a velocidade final: ");
        velocidadeFinal = ler.nextDouble();

        System.out.print("Digite o tempo: ");
        tempo = ler.nextDouble();

        resultado = (velocidadeFinal - velocidadeInicial) / tempo;

        System.out.println("Formula: a = (Vf - Vi) / tempo");
        System.out.println("Resultado: " + resultado + " m/s2");
    }
}
