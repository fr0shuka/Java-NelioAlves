package Application;

import Entities.Product;

import java.util.Scanner;

public class ProgramProduct {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Insira a dados do produto: ");
        System.out.print("Name: ");
        product.name = ler.nextLine();
        System.out.print("Preço: ");
        product.price = ler.nextDouble();
        System.out.print("Qual a quantidade em stock: ");
        product.quantity = ler.nextInt();


        System.out.println();
        System.out.println(" Dados do produto: " + product);

        System.out.println();
        System.out.println("Quantas unidades quer adicionar? ");
        int quantity = ler.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println(" Dados atualizados: " + product);


        System.out.println();
        System.out.println("Quantas unidades quer remover? ");
        quantity = ler.nextInt();
        product.removeProducts(quantity);


        System.out.println();
        System.out.println(" Dados atualizados: " + product);


        ler.close();
    }
}
