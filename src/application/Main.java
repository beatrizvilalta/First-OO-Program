package application;

import entities.Products;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        Products product = new Products(name, price, quantity);

        double totalValue = product.totalValue();

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of product to be added in stock: ");
        int quantityAdded = sc.nextInt();

        product.addProducts(quantityAdded);

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of product to be removed from stock:");
        int quantityRemoved = sc.nextInt();

        product.removeProducts(quantityRemoved);

        System.out.println("Updated data: " + product);


        sc.close();
    }
}
