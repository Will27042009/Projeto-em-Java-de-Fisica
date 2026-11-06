import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int escolha = 1;

        while (escolha != 0) {

            System.out.println("========== Escolha sua formula ==========");
            System.out.println("");
            System.out.println("Cinematica:");
            System.out.println("Velocidade media -> 1");
            System.out.println("Aceleracao media -> 2");
            System.out.println("Posicao no MRU -> 3");
            System.out.println("Velocidade no MRUV -> 4");
            System.out.println("Equacao de Torricelli -> 5");
            System.out.println("");
            System.out.println("Dinamica:");
            System.out.println("Segunda Lei de Newton -> 6");
            System.out.println("Peso -> 7");
            System.out.println("");
            System.out.println("Energia:");
            System.out.println("Trabalho de uma forca -> 8");
            System.out.println("Energia cinetica -> 9");
            System.out.println("Energia potencial -> 10");
            System.out.println("Potencia media -> 11");
            System.out.println("");
            System.out.println("Outras formulas:");
            System.out.println("Densidade -> 12");
            System.out.println("Pressao -> 13");
            System.out.println("Calor sensivel -> 14");
            System.out.println("Lei de Ohm -> 15");
            System.out.println("");
            System.out.println("Digite 0 para sair");
            System.out.println("=========================================");

            escolha = ler.nextInt();

            if (escolha == 1) {
                VelocidadeMedia.executar(ler);
            }
            else if (escolha == 2) {
                AceleracaoMedia.executar(ler);
            }
            else if (escolha == 3) {
                PosicaoMRU.executar(ler);
            }
            else if (escolha == 4) {
                VelocidadeMRUV.executar(ler);
            }
            else if (escolha == 5) {
                Torricelli.executar(ler);
            }
            else if (escolha == 6) {
                ForcaNewton.executar(ler);
            }
            else if (escolha == 7) {
                Peso.executar(ler);
            }
            else if (escolha == 8) {
                Trabalho.executar(ler);
            }
            else if (escolha == 9) {
                EnergiaCinetica.executar(ler);
            }
            else if (escolha == 10) {
                EnergiaPotencial.executar(ler);
            }
            else if (escolha == 11) {
                PotenciaMedia.executar(ler);
            }
            else if (escolha == 12) {
                Densidade.executar(ler);
            }
            else if (escolha == 13) {
                Pressao.executar(ler);
            }
            else if (escolha == 14) {
                CalorSensivel.executar(ler);
            }
            else if (escolha == 15) {
                LeiOhm.executar(ler);
            }
            else if (escolha == 0) {
                System.out.println("Programa encerrado.");
            }
            else {
                System.out.println("Opcao invalida.");
            }
        }

        ler.close();
    }
}
