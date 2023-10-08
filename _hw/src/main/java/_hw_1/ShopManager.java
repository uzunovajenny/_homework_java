package _hw_1;

public class ShopManager {

    private Product[] products;
    private int productCount;

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
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

