package gabriel.cardoso.model;

import gabriel.cardoso.Interface.Media;

public class Aluno implements Media {
    private Prova prova1;
    private Prova prova2;
    String nome;

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        prova1 = new Prova(1);
        prova2 = new Prova(2);
        prova1.setNotaParte1(nota1);
        prova1.setNotaParte2(nota2);
        prova2.setNotaParte1(nota3);
        prova2.setNotaParte2(nota4);
    }

    @Override
    public double calcularMedia() {
       double x = this.prova1.calcularNotaTotal();
       double y = this.prova2.calcularNotaTotal();
       double media = (x+y)/2.0;
       return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Total prova1 =" + prova1.calcularNotaTotal() +
                ",Total prova2 =" + prova2.calcularNotaTotal() +
                ", Nome ='" + nome +  '\'' +
                ", Média de provas = " +calcularMedia() +
                '}';
    }
}
