//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Використання ProductBuilder для створення об'єкту Product
        Product product = new ProductBuilder()
                .setName("Phone")
                .setType("Electronics")
                .setPrice(500)
                .build();

        System.out.println(product);
        FlyweightFactory factory = new FlyweightFactory();

        // Отримання Flyweight об'єктів за допомогою фабрики
        Flyweight fw1 = factory.getFlyweight("shared");
        Flyweight fw2 = factory.getFlyweight("shared");
        Flyweight fw3 = factory.getFlyweight("unique");

        // Виклик операції на Flyweight об'єктах
        fw1.operation(); // Виведе: ConcreteFlyweight: shared
        fw2.operation(); // Виведе: ConcreteFlyweight: shared
        fw3.operation(); // Виведе: ConcreteFlyweight: unique

        // Перевірка кількості об'єктів в кеші
        System.out.println("Number of Flyweight objects created: " + factory.getFlyweightCount());
        Context context = new Context();

        // Викликаємо request, щоб змінити стан об'єкта Context
        context.request(); // Виведе: Context is in state A
        context.request(); // Виведе: Context is in state B
        context.request(); // Виведе: Context is in state A
    }
}