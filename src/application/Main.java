package application;

import entities.Products;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products product;
        product = new Products();

        System.out.println("Enter the product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        double totalValue = product.totalValue();

        product.showResult(product.name, product.price, product.quantity, totalValue);

        System.out.println("Enter the number of product to be added in stock: ");
        int quantityAdded = sc.nextInt();

        product.addProducts(quantityAdded);

        product.showResult(product.name, product.price, product.quantity, product.totalValue());

        System.out.println("Enter the number of product to be removed from stock:");
        int quantityRemoved = sc.nextInt();

        product.removeProducts(quantityRemoved);

        product.showResult(product.name, product.price, product.quantity, product.totalValue());


        sc.close();
    }
}
