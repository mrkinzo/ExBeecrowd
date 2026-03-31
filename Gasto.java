import java.util.Locale;
import java.util.Scanner;

public class Gasto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Reading time and speed
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        ViagemCalculo viagem = new ViagemCalculo(tempo, velocidade);

        // Calculate: (Speed * Time) / 12.0
        double litrosNecessarios = (viagem.getVelocidade() * viagem.getTempo()) / 12.0;

        System.out.printf("%.3f%n", litrosNecessarios);

        sc.close();
    }
}

class ViagemCalculo {
    private int tempo;
    private int velocidade;

    public ViagemCalculo(int tempo, int velocidade) {
        this.tempo = tempo;
        this.velocidade = velocidade;
    }

    public int getTempo() {
        return tempo;
    }

    public int getVelocidade() {
        return velocidade;
    }
}