package Exercicios;

import java.util.Scanner;

public class s6ep44 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();

        int soma = 0;
        while (x != 0) {
            soma = soma + x;
            x= ler.nextInt();

        }
        System.out.println(soma);
        ler.close();
    }
}
