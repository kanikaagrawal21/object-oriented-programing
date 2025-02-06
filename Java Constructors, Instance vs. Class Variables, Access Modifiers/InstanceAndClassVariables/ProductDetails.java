package InstanceAndClassVariables;
class Product {
    public String productName;
    public int Price;
    static int totalProduct = 0;

    public Product(String productName, int price) {
        this.productName = productName;
        this.Price = Price;
        totalProduct++;
    }

        void displayProductDetails () {
            System.out.println("ProductName" + productName);
            System.out.println("price" + Price);

        }
        static void displayTotalProduct () {
            System.out.println("Total Product" + totalProduct);
        }
    }

    public class ProductDetails {
        public static void main(String[] args){

        Product p1 = new Product("laptop",300);
        Product p2 = new Product("phone",750);
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
