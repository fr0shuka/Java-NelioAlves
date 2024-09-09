package Exercicios;

import java.util.Scanner;

public class s7ep61 {

    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

    System.out.println("Insere 3 numeros: ");
    int a = ler.nextInt();
    int b = ler.nextInt();
    int c = ler.nextInt();

    int high = max (a,b,c); //buscar a função max.
    showResult(high); //buscar a funcao showResult para imprimir o resultado.

    ler.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x>y && x>z){
            aux = x;
        }
        else if (y>z){
            aux = y;
        }
        else{
            aux=z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("O maior é : "+ value);
    }
}
