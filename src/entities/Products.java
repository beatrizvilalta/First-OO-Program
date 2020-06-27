package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double totalValue(){

        double result = price * quantity;

        return result;
    }
    public void showResult(String name, double price, int quantity, double totalValue) {

        System.out.printf("Product Data: %s, $ %.2f, %d unit, Total: %.2f%n", name, price, quantity, totalValue);

    }

    public void addProducts(int quantity) {

        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {

        this.quantity -= quantity;

    }


}
