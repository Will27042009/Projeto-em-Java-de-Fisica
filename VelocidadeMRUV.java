import java.util.Scanner;

public class VelocidadeMRUV {

    public static void executar(Scanner ler) {

        double velocidadeInicial, aceleracao, tempo, resultado;

        System.out.println("===== Velocidade no MRUV =====");
        System.out.print("Digite a velocidade inicial: ");
        velocidadeInicial = ler.nextDouble();

        System.out.print("Digite a aceleracao: ");
        aceleracao = ler.nextDouble();

        System.out.print("Digite o tempo: ");
        tempo = ler.nextDouble();

        resultado = velocidadeInicial + aceleracao * tempo;

        System.out.println("Formula: V = Vi + A * T");
        System.out.println("Resultado: " + resultado + " m/s");
    }
}
