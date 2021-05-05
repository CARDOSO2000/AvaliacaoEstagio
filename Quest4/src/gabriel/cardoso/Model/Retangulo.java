package gabriel.cardoso.Model;

public class Retangulo extends Figura{
    public double lado1;
    public double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "Lado1 = " + lado1 +
                ", Lado2 = " + lado2 +
                ", Area = "+ calcularArea() +
                '}';
    }
}
