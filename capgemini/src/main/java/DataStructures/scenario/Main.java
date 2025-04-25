package DataStructures.scenario;

public class Main {
    public static void main(String[] args) {
        Product p =new Product(1,"scasda",12.3);
        Product p1 =new Product(2,"asdfda",90);
        Product p2 =new Product(3,"lkjlkada",23.33);
        Product p3 =new Product(4,"ijroaida",99);
        Cart cart = new Cart();
        cart.addProduct(p,1);
        cart.addProduct(p1,2);
        cart.addProduct(p2,1);
        cart.displayCart();
        System.out.println("total Price "+Math.floor(cart.getTotal()*100)/100);
    }
}
