package gabriel.cardoso;

import gabriel.cardoso.Model.*;

public class Main {

    public static void main(String[] args) {
        /* Teste das figuras */
        Figura f1 = new Triangulo(2.0,3.0);
        Figura f2 = new Circunferencia(5.5);
        Figura f3 = new Trapezio(4.4,2.2,5.0);
        Figura f4 = new Quadrado(6.0);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());
        /* Teste Figura Complexa*/
        Figura f5 = new Quadrado(3.0);
        Figura f6 = new Quadrado(10.0);
        Figura f7 = new Retangulo(2.0,7.0);
        Figura f8 = new Retangulo(5.0,3.0);
        Figura f9 = new FiguraComplexa();
        ((FiguraComplexa) f9).adicionarFigura(f5);
        ((FiguraComplexa) f9).adicionarFigura(f6);
        ((FiguraComplexa) f9).adicionarFigura(f7);
        ((FiguraComplexa) f9).adicionarFigura(f8);
        System.out.println(f9.toString());

    }
}
