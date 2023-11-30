package week_09.live_class;


public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Beats", "Solo", 200, "Black");
        System.out.println("product's brand: " + product.brand +
                "\nproduct's model: " + product.model +
                "\nproduct's stock amount: " + product.stockAmount +
                "\nproduct's color: " + product.color);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }


}

