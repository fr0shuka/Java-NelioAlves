package Application;

import Entities.Funcionario;

import java.util.Scanner;

public class ProgramFuncionario {

    public static void main (String[] args){

        Scanner ler = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Qual o nome do funcionário: ");
        funcionario.name = ler.nextLine();
        System.out.println("Qual o salario do funcionário " + funcionario.name + ": ");
        funcionario.salario = ler.nextDouble();
        System.out.println("Qual a taxa a descontar ao funcionário "+ funcionario.name + ": ");
        funcionario.tax = ler.nextDouble();


        System.out.println("O funcionário: " + funcionario);
        System.out.println("Quanta percentagem gostaria acrescentar ao salário? ");
        double percent = ler.nextDouble();

        funcionario.percAcrescimo(percent);

        System.out.println();
        System.out.println("Atualização: " + funcionario);


    }

}
