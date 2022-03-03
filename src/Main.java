

public class Main {

    public static void main(String[] args) {
	    Electronics radio = new Electronics("Radio");
        Foods bread = new Foods("Bread");
        SportsGoods ball = new SportsGoods("Ball");

        Cart customerCart = new Cart("Customer cart");
        customerCart.addProduct(radio);
        customerCart.addProduct(bread);
        customerCart.addProduct(ball);

        System.out.println(customerCart.numProducts());
    }
}
