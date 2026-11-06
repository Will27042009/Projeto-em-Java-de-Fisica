import java.util.Scanner;

public class LeiOhm {

    public static void executar(Scanner ler) {

        double resistencia, corrente, resultado;

        System.out.println("===== Lei de Ohm =====");
        System.out.print("Digite a resistencia em ohms: ");
        resistencia = ler.nextDouble();

        System.out.print("Digite a corrente em amperes: ");
        corrente = ler.nextDouble();

        resultado = resistencia * corrente;

        System.out.println("Formula: U = R * I");
        System.out.println("Resultado: " + resultado + " V");
    }
}
