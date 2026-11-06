import java.util.Scanner;

public class ForcaNewton {

    public static void executar(Scanner ler) {

        double massa, aceleracao, resultado;

        System.out.println("===== Segunda Lei de Newton =====");
        System.out.print("Digite a massa em kg: ");
        massa = ler.nextDouble();

        System.out.print("Digite a aceleracao: ");
        aceleracao = ler.nextDouble();

        resultado = massa * aceleracao;

        System.out.println("Formula: F = M * A");
        System.out.println("Resultado: " + resultado + " N");
    }
}
