import java.util.Scanner;

public class Product {

    int pcode;
    String pname;
    double price;

    // Constructor
    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }

    // Static method to find lowest price
    static Product lowestPrice(Product p1, Product p2, Product p3) {
        Product lowest = p1;

        if (p2.price < lowest.price)
            lowest = p2;
        if (p3.price < lowest.price)
            lowest = p3;

        return lowest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for product 1
        System.out.println("Enter details of Product 1 (code name price):");
        Product p1 = new Product(sc.nextInt(), sc.next(), sc.nextDouble());

        // Input for product 2
        System.out.println("Enter details of Product 2 (code name price):");
        Product p2 = new Product(sc.nextInt(), sc.next(), sc.nextDouble());

        // Input for product 3
        System.out.println("Enter details of Product 3 (code name price):");
        Product p3 = new Product(sc.nextInt(), sc.next(), sc.nextDouble());

        // Find and display lowest priced product
        Product low = lowestPrice(p1, p2, p3);

        System.out.println("Product with lowest price:");
        low.display();

        sc.close();
    }
}
