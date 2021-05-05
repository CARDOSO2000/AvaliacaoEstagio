package Model;

public class Triangulo extends Figura {
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double a = (this.base*this.altura)/2.0;
        return a;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "Base =" + base +
                ", Altura =" + altura +
                ", Area = " + calcularArea() +
                '}';
    }
}
