package Exercicios;

import java.util.Scanner;

public class S5ep39 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valor, desconto;

        System.out.println("Digite o valor a pagar: ");
        valor=ler.nextInt();

        desconto=(valor>10) ? valor*1.23 : valor*1.06;
        System.out.println("Valor é de" +desconto+ " euros");

    }
}
