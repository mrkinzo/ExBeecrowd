import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        // Set Locale to US so it accepts "." as a decimal separator
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Reading p1(x1, y1)
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Reading p2(x2, y2)
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);

        double Distancia = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) +
                Math.pow(p2.getY() - p1.getY(), 2));

        System.out.printf("%.4f%n", Distancia);

        sc.close();
    }
}

class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}