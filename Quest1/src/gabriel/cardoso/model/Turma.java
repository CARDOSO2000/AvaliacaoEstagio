package gabriel.cardoso.model;

import gabriel.cardoso.Interface.Media;

import java.util.ArrayList;
import java.util.List;

public class Turma implements Media {
    public Aluno aluno1;
    public Aluno aluno2;
    public Aluno aluno3;
    public ArrayList<Aluno> alunos = new ArrayList();
    public Turma(Aluno aluno1, Aluno aluno2, Aluno aluno3) {
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
    }

    @Override
    public double calcularMedia() {
        double total = 0.0;
        double i = 0.0;
        for (Aluno aluno:
             this.alunos) {
            total = aluno.calcularMedia() + total;
            i++;
        }
        return total/i;
    }
}
