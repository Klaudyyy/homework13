//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Телефон", 975689, 54000, "Электроника");
        Product product2 = new Product("Наушники", 975689, 22000, "Электроника");
        System.out.println(product1.equals(product2));
        System.out.println(product1);
        System.out.println(product2);

        Product[] basket1 = {product1, product2};
        Product[] basket2 = {product1, product2};
        Order order1 = new Order("Ваня", basket1);
        Order order2 = new Order("Петр", basket2);
        Order order3 = new Order("Дима", basket1);
        System.out.println("Заказ 1: " + order1);
        System.out.println("Заказ 2: " + order2);
        System.out.println("Заказ 3: " + order3);

        System.out.println("order1 равен order2?" + order1.equals(order2));
        System.out.println("order1 равен order3?" + order1.equals(order3));

    }
}