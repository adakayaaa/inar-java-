package week_09.live_class;

public class Product {
    //attributes
    private String id;
    public String brand;
    public String model;
    public int stockAmount;
    public String color;

    public Product(String brand, String model, int stockAmount, String color) {
        this.brand = brand;
        this.model = model;
        this.stockAmount = stockAmount;
        this.color = color;

    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return id;
    }
}

