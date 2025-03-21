package cidemo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {

    @Test
    void decreaseStockTest() {
        Product product = new Product(5);

        product.decreaseStock();

        assertThat(product.getStock()).isEqualTo(4);
    }

    @Test
    void increaseStockTest() {
        Product product = new Product(5);

        product.increaseStock();

        assertThat(product.getStock()).isEqualTo(6);
    }
}
