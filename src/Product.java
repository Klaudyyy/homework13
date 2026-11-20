import java.util.Objects;

public class Product {
    public String name;
    public int id;
    public int price;
    public String category;

    public Product(String name, int id, int price, String category) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Товар[ артикул=" + id + ", название= " + name + ", цена= " + price + ", категория= " + category + "]";
    }
        @Override
        public boolean equals (Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
                Product product = (Product) o;
                return this.id == product.id && Objects.equals(this.category, product.category);
            }
        }
