public class Product {
    private String name;
    private String type;
    private int price;

    public Product(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // Гетери для полів класу Product
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}


