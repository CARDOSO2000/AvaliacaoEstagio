package Model;

public class Quadrado extends Figura{
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2.0);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "Lado = " + lado +
                ", Area = " + calcularArea() +
                '}';
    }
}
