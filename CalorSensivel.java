import java.util.Scanner;

public class CalorSensivel {

    public static void executar(Scanner ler) {

        double massa, calorEspecifico, temperatura, resultado;

        System.out.println("===== Calor sensivel =====");
        System.out.print("Digite a massa em kg: ");
        massa = ler.nextDouble();

        System.out.print("Digite o calor especifico: ");
        calorEspecifico = ler.nextDouble();

        System.out.print("Digite a variacao de temperatura: ");
        temperatura = ler.nextDouble();

        resultado = massa * calorEspecifico * temperatura;

        System.out.println("Formula: Q = M * C * Delta T");
        System.out.println("Resultado: " + resultado + " J");
    }
}
