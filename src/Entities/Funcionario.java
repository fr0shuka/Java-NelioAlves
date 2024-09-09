package Entities;

public class Funcionario {

    public String name;
    public double salario;
    public double tax;

    public double salarioBruto(){
        return salario - tax;
    }

    public void percAcrescimo(double percent) {
        salario += salario * percent / 100.0;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", salarioBruto());
    }
}
