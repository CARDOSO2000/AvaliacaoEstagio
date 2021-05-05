package gabriel.cardoso;

import gabriel.cardoso.model.Aluno;
import gabriel.cardoso.model.Turma;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Aluno 1", 4.0, 2.5,1.0,7.0);
        Aluno aluno2 = new Aluno("Aluno 2", 6.5, 3.5,0.0,3.0);
        Aluno aluno3 = new Aluno("Aluno 3", 5.0, 4.0,6.0,1.5);
        Turma turma = new Turma(aluno1, aluno2,aluno3);
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println("Média da turma: " + turma.calcularMedia());
    }
}
