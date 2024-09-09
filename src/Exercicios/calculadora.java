package Exercicios;

public class calculadora {
    public static void main(String[] args) {


      int i=0;
      int j=0;

        for (j = 1; j <= 10; j++) {
            for (i = 1; i <= 10; i++) {
                System.out.println(j + " * " + i + " = " + j * i);
            }
            System.out.println("----------");
        }
    }
}