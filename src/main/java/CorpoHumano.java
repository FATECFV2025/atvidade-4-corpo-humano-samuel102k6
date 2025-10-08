package main.java;

public class CorpoHumano {
    private double massa;
    private double volume;
    private double densidade;

    // Construtor
    public CorpoHumano(double massa, double volume) {
        this.massa = massa;
        this.volume = volume;
        this.calcularDensidade();
    }

    // Método privado para calcular densidade
    private void calcularDensidade() {
        if (volume > 0) {
            this.densidade = this.massa / this.volume;
        } else {
            this.densidade = 0.0;
        }
    }

    // Getters
    public double getMassa() {
        return massa;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensidade() {
        return densidade;
    }

    // Setters
    public void setMassa(double massa) {
        if (massa >= 0) {
            this.massa = massa;
            this.calcularDensidade(); // Atualiza densidade
        }
    }

    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume;
            this.calcularDensidade(); // Atualiza densidade
        } else {
            System.out.println("Erro: o volume deve ser maior que zero.");
        }
}
