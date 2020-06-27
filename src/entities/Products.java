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

    public void addProducts(int quantityAdded) {

        quantityAdded = quantityAdded + quantity;
        quantity = quantityAdded;
        showResult(name, price, quantityAdded, totalValue());

    }

    public void removeProducts(int quantityRemoved) {

        quantityRemoved = quantity - quantityRemoved;
        quantity = quantityRemoved;
        showResult(name, price, quantityRemoved, totalValue());

    }


}
