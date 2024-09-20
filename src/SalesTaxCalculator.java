public class SalesTaxCalculator {
    public static void main(String[] args) {
        System.out.print("Input regular price below");


        double price = 5;
        double salesTaxRate = 0.05;
        double totalTax = salesTaxRate * price;

        System.out.println("The regular cost before tax is " + price);
        System.out.println("The regular total cost after tax is" + (price + totalTax));

    }
}