import java.util.Scanner;

public class PosicaoMRU {

    public static void executar(Scanner ler) {

        double posicaoInicial, velocidade, tempo, resultado;

        System.out.println("===== Posicao no MRU =====");
        System.out.print("Digite a posicao inicial: ");
        posicaoInicial = ler.nextDouble();

        System.out.print("Digite a velocidade: ");
        velocidade = ler.nextDouble();

        System.out.print("Digite o tempo: ");
        tempo = ler.nextDouble();

        resultado = posicaoInicial + velocidade * tempo;

        System.out.println("Formula: S = S0 + V * T");
        System.out.println("Resultado: " + resultado + " metros");
    }
}
