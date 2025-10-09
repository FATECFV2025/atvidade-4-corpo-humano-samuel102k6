package modelo;

public class CorpoHumano {
    private double massa;
    private double volume;
    private double densidade;
    private double altura;

    // Construtor
    public CorpoHumano(double massa, double volume, double densidade, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return massa / (altura * altura);
    }

    // Método para atualizar massa e altura
    public void atualizarMedidas(double novaMassa, double novaAltura) {
        this.massa = novaMassa;
        this.altura = novaAltura;
    }

    // Getters para acesso aos atributos
    public double getMassa() {
        return massa;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensidade() {
        return densidade;
    }

    public double getAltura() {
        return altura;
    }
}
