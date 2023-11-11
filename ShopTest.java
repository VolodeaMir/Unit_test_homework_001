import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    @Test
    public void testSortProductsByPrice() {
        Shop shop = new Shop();
        Product product1 = new Product("Laptop", 800.0);
        Product product2 = new Product("Phone", 500.0);
        Product product3 = new Product("Tablet", 300.0);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        shop.sortProductsByPrice();

        assertThat(shop.getProducts()).containsExactly(product3, product2, product1);
    }

    @Test
    public void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        Product product1 = new Product("Laptop", 800.0);
        Product product2 = new Product("Phone", 500.0);
        Product product3 = new Product("Tablet", 700.0);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        assertThat(mostExpensiveProduct).isEqualTo(product1);
    }
}
