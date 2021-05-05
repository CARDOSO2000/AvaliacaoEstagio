package Model;

public class Circunferencia extends Figura{
    public double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*(Math.pow(this.raio,2.0));
    }

    @Override
    public String toString() {
        return "Circunferencia{" +
                "Raio = " + raio +
                ", Area = " + calcularArea() +
                '}';
    }
}
