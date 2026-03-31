import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {
        Scanner LER = new Scanner(System.in);
        Peca peca1 = new Peca(LER.nextInt(), LER.nextInt(), LER.nextDouble());
        Peca peca2 = new Peca(LER.nextInt(), LER.nextInt(), LER.nextDouble());
        double valorPagar = (peca1.getNumPecas() * peca1.getValorPeca()) + (peca2.getNumPecas() * peca2.getValorPeca());
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorPagar));
    }
}

class Peca {
    private int cod;
    private int numPecas;
    private double valorPeca;

    public Peca(int cod, int numPecas, double valorPeca) {
        this.cod = cod;
        this.numPecas = numPecas;
        this.valorPeca = valorPeca;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getNumPecas() {
        return numPecas;
    }

    public void setNumPecas(int numPecas) {
        this.numPecas = numPecas;
    }

    public double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(double valorPeca) {
        this.valorPeca = valorPeca;
    }
}
