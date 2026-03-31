import java.util.*;

public class Salario {
    public static void main(String[] args) {
        Scanner LER = new Scanner(System.in);
        Employee wilson = new Employee(LER.nextInt(), LER.next(), LER.nextInt(), LER.nextDouble());
        float salrio = (wilson.getcHoraria() * (float) wilson.getSalH());
        System.out.println("NUMBER = " + wilson.getNumber());
        System.out.println("SALARY = U$ " + String.format("%.2f", salrio));
    }
}

class Employee {
    private int number;
    private String name;
    private double salH;
    private int cHoraria;

    public Employee(int number, String name, int cHoraria, double salH) {
        this.cHoraria = cHoraria;
        this.name = name;
        this.number = number;
        this.salH = salH;
    }

    public int getcHoraria() {
        return cHoraria;
    }

    public void setcHoraria(int cHoraria) {
        this.cHoraria = cHoraria;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalH() {
        return salH;
    }

    public void setSalH(double salH) {
        this.salH = salH;
    }

}