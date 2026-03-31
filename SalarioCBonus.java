import java.util.*;

public class SalarioCBonus {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee wilson = new Employee(LER.next(), LER.nextDouble(), LER.nextDouble());
        double salario = wilson.getSalario() + (wilson.getVendas() * 0.15);

        System.out.println("TOTAL = R$ " + String.format("%.2f", salario));
    }
}

class Employee {
    private String name;
    private double salario;
    private double vendas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public Employee(String name, double salario, double vendas) {
        this.name = name;
        this.salario = salario;
        this.vendas = vendas;
    }

}