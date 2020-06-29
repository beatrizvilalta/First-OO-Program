package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double totalValue(){

        double result = price * quantity;

        return result;
    }
   

    public void addProducts(int quantity) {

        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {

        this.quantity -= quantity;

    }
    public String toString() {

        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unit, Total: "
                + String.format("%.2f", totalValue());
    }


}
