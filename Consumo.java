import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner LER = new Scanner(System.in);
        Viagem viagem = new Viagem(LER.nextInt(), LER.nextFloat());
        float consumoMedio = viagem.getDistancia() / viagem.getConsumo();
        System.out.println(String.format("%.3f", consumoMedio) + " km/l");
    }
}

class Viagem {
    private int consumo;
    private float distancia;

    public Viagem(int consumo, float distancia) {
        this.consumo = consumo;
        this.distancia = distancia;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
}
