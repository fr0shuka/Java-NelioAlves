package Exercicios;

import java.util.Scanner;

public class s6ep55 {

    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        char resp;

        do{



        System.out.print("Digite a temperatura em Celsius: ");
        double C = ler.nextDouble();
        double F = 9.0 * C / 5.0 + 32.0;
        System.out.printf("Equivalentem Fharenheit: %.1f%n", F);
        System.out.print("Deseja repetir (s/n)? ");
        resp = ler.next().charAt(0);
        } while (resp != 'n');
    }
}
