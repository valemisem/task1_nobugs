package task2.products;

public class Main {
    public static void main(String[] args) {

        PriceList priceList = new PriceList();
        Product product1 = new Product("product_1", 100);
        Product product2 = new Product("product_2", 200);

        priceList.addProduct(product1);
        priceList.addProduct(product2);

        priceList.changePrice(product1, 600);
        priceList.printIndividualProductByName("product_1");
    }
}
