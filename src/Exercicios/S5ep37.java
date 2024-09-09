package Exercicios;

import java.util.Scanner;
public class S5ep37 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int minutos, valor;
        double total, minextra;
        valor=50;
        minextra=2.0;
        System.out.println("Quantos minutos esteve em chamada? ");
        minutos= ler.nextInt();

        total=50.0;
        if (minutos>100){
            total=total+(minutos-100)*minextra;
        }
        System.out.println("O custo da chamada é de "+total+" euros.");
    }
}