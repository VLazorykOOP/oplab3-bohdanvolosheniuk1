public class ProductBuilder {
    private String name;
    private String type;
    private int price;

    public ProductBuilder() {
        // Значення за замовчуванням або ініціалізація початкових значень
        this.name = "Default Name";
        this.type = "Default Type";
        this.price = 0;
    }

    // Методи для встановлення значень полів
    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ProductBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    // Метод для побудови об'єкта Product
    public Product build() {
        return new Product(name, type, price);
    }
}
