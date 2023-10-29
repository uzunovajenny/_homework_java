package _hw_1;

public class ShopManager {

    private Product[] products;
    private int productCount;


    public ShopManager(int maxProduct) {
        products = new Product[maxProduct];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
            System.out.println("Товар " + product.name + " " + product.category + " " + product.price + " " + product.currency + " добавлен");
        } else {
            System.out.println("Достигнуто максимальное количество товаров");
        }
    }

    public Product[] getProductsByCategory(ProductCategory category) {
        Product[] result = new Product[productCount];
        int resultCount = 0;
        for (int i = 0; i < productCount; i++) {
            if (products[i].getCategory() == category) {
                result[resultCount] = products[i];
                resultCount++;
            }
        }
        return result;
    }

    public void getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        StringBuilder result = new StringBuilder();
        for (Product product : this.products) {
            if (product.currency == currency && product.price >= minPrice && product.price <= maxPrice) {
                result.append(product.toString());
                result.append("\n");
            }
        }

        System.out.println(result);
    }
}

class ShopManagerTest {

    public static void main(String[] args) {

        ShopManager shopManager = new ShopManager(6);

        shopManager.addProduct(new Product(1, "Levis", ProductCategory.JEANS, 12.99, Currency.USD));
        shopManager.addProduct(new Product(2, "Diesel", ProductCategory.JEANS, 24.99, Currency.USD));
        shopManager.addProduct(new Product(3, "Bershka", ProductCategory.JACKETS, 29.99, Currency.EUR));
        shopManager.addProduct(new Product(4, "ZARA", ProductCategory.DRESSES, 28.99, Currency.GPB));
        shopManager.addProduct(new Product(5, "O`stin", ProductCategory.JACKETS, 34.99, Currency.EUR));
        shopManager.addProduct(new Product(6, "H&M", ProductCategory.DRESSES, 14.99, Currency.USD));
        shopManager.addProduct(new Product(7, "KiK", ProductCategory.JACKETS, 17.99, Currency.GPB));


    }

}

