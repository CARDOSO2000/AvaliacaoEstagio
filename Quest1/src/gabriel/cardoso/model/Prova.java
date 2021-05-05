package gabriel.cardoso.model;

public class Prova {
    private double notaParte1;
    private double notaParte2;
    int id;

    public Prova(int id) {
        this.id = id;
    }


    public void setNotaParte1(double notaParte1) {
        this.notaParte1 = notaParte1;
    }

    public void setNotaParte2(double notaParte2) {
        this.notaParte2 = notaParte2;
    }
    public double calcularNotaTotal(){
        double totalNotaTotal = this.notaParte1 + this.notaParte2;
        if(totalNotaTotal > 10){
            System.out.println("NOTA PASSOU DE 10 deverá ser reincerida");
            return 0;
        }else {
            return totalNotaTotal;
        }
    }
}
