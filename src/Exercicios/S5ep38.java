package Exercicios;

import java.util.Scanner;

public class S5ep38 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.println("Digite um número de 1 a 7: ");
        n=ler.nextInt();

        String dia;

        switch (n) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia="Valor inválido";
        }
            System.out.println("O dia da semana é: "+ dia);
        }
}
