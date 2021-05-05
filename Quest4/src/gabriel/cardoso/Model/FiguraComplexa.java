package gabriel.cardoso.Model;

import java.util.ArrayList;

public class FiguraComplexa extends Figura{
    public ArrayList<Figura> figuras = new ArrayList<>();
    public void adicionarFigura(Figura f){
        figuras.add(f);
    }

    @Override
    public double calcularArea() {
        double atotal = 0.0;
        for (Figura figura:this.figuras) {
            atotal = figura.calcularArea() + atotal;
        }
        return atotal;
    }

    @Override
    public String toString() {
        return "FiguraComplexa{"+
                "Lista de Figuras = " + figuras.toString() +
                ", Area = "+ calcularArea() +
                "}";
    }
}
