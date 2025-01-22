package class1.productorder;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        order1.productname = "두부";
        order1.price = 200;
        order1.quantity = 100;

        ProductOrder order2 = new ProductOrder();
        order1.productname = "김치";
        order1.price = 300;
        order1.quantity = 200;

        ProductOrder orders[] = new ProductOrder[]{order1, order1};

        for (ProductOrder order : orders) {
            System.out.println();
        }
    }
}
