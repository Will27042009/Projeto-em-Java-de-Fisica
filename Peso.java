import java.util.Scanner;

public class Peso {

    public static void executar(Scanner ler) {

        double massa, gravidade, resultado;

        System.out.println("===== Peso =====");
        System.out.print("Digite a massa em kg: ");
        massa = ler.nextDouble();

        gravidade = 9.8;
        resultado = massa * gravidade;

        System.out.println("Formula: P = M * G");
        System.out.println("A gravidade utilizada foi 9.8 m/s2");
        System.out.println("Resultado: " + resultado + " N");
    }
}
