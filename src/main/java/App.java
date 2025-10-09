import java.util.Scanner;

public class App {
    public static void app(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        System.out.print("Digite a massa inicial (kg): ");
        double massa = scanner.nextDouble();

        System.out.print("Digite o volume inicial (m³): ");
        double volume = scanner.nextDouble();

        System.out.print("Digite a densidade inicial (kg/m³): ");
        double densidade = scanner.nextDouble();

        System.out.print("Digite a altura inicial (m): ");
        double altura = scanner.nextDouble();

        // Criar objeto CorpoHumano
        CorpoHumano corpo = new CorpoHumano(massa, volume, densidade, altura);

        System.out.println("\n=== VALORES INICIAIS ===");
        System.out.println("Massa: " + corpo.getMassa() + " kg");
        System.out.println("Volume: " + corpo.getVolume() + " m³");
        System.out.println("Densidade: " + corpo.getDensidade() + " kg/m³");
        System.out.println("Altura: " + corpo.getAltura() + " m");
        System.out.println("IMC: " + corpo.calcularIMC());

        // Solicitar novos valores
        System.out.print("Digite uma nova massa (kg): ");
        double novaMassa = scanner.nextDouble();

        System.out.print("Digite uma nova altura (m): ");
        double novaAltura = scanner.nextDouble();

        // Atualizar medidas
        corpo.atualizarMedidas(novaMassa, novaAltura);

        // Exibir novos valores
        System.out.println("\nNovos valores:");
        System.out.println("Massa: " + corpo.getMassa() + " kg");
        System.out.println("Altura: " + corpo.getAltura() + " m");
        System.out.println("Novo IMC: " + corpo.calcularIMC());

        scanner.close();
    }
}

