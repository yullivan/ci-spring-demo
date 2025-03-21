package cidemo;

public class Product {

    private int stock;

    protected Product() {
    }

    public Product(int stock) {
        this.stock = stock;
    }

    public void decreaseStock() {
        stock--;
    }

    public int getStock() {
        return stock;
    }
}
