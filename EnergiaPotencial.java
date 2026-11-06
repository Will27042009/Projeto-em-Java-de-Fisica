import java.util.Scanner;

public class EnergiaPotencial {

    public static void executar(Scanner ler) {

        double massa, altura, gravidade, resultado;

        System.out.println("===== Energia potencial gravitacional =====");
        System.out.print("Digite a massa em kg: ");
        massa = ler.nextDouble();

        System.out.print("Digite a altura em metros: ");
        altura = ler.nextDouble();

        gravidade = 9.8;
        resultado = massa * gravidade * altura;

        System.out.println("Formula: Ep = M * G * H");
        System.out.println("A gravidade utilizada foi 9.8 m/s2");
        System.out.println("Resultado: " + resultado + " J");
    }
}
