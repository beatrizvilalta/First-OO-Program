package application;

import entities.Products;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products products;
        products = new Products();

        System.out.println("Enter the product data: ");
        System.out.println("Name: ");
        products.name = sc.nextLine();
        System.out.println("Price: ");
        products.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        products.quantity = sc.nextInt();

        double totalValue = products.totalValue();

        products.showResult(products.name, products.price, products.quantity, totalValue);

        System.out.println("Enter the number of products to be added in stock: ");

        int quantityAdded = sc.nextInt();
        products.addProducts(quantityAdded);

        System.out.println("Enter the number of products to be removed from stock:");
        int quantityRemoved = sc.nextInt();
        products.removeProducts(quantityRemoved);


        sc.close();
    }
}
