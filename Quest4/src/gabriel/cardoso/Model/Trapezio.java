package gabriel.cardoso.Model;

public class Trapezio extends Figura{
    public double base_maior;
    public double base_menor;
    public double altura;

    public Trapezio(double base_maior, double base_menor, double altura) {
        this.base_maior = base_maior;
        this.base_menor = base_menor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double a = (this.base_maior+this.base_menor)*this.altura/2.0;
        return a;
    }

    @Override
    public String toString() {
        return "Trapezio{" +
                "Base_maior = " + base_maior +
                ", Base_menor = " + base_menor +
                ", Altura = " + altura +
                ", Area = " + calcularArea() +
                '}';
    }
}
