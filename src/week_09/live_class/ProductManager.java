package week_09.live_class;

public class ProductManager {
    public void add(Product product){  //object referer
        System.out.println("Product added to database");
        product.setId("BeatsSoloWireless");
        System.out.println("product's id: " + product.getId());

    }
}

