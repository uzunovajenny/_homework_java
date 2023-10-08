package _hw_1;

public class Clothing extends Product {

    Size size;

    public Clothing(int id, String name, ProductCategory category, double price, Currency currency, Size size) {
        super(id, name, category, price, currency);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", currency=" + currency +
                '}';
    }
}
