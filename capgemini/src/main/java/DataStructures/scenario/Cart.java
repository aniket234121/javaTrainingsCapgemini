package DataStructures.scenario;
import DataStructures.HashMap.*;

import java.util.ArrayList;

public class Cart {
    HashMap items;
    Integer Products;
    public void addProduct(Product product,int quantity)
    {
        items.put(product,quantity);
        Products=items.getSize();
    }
    public void removeProduct(Product product)
    {
        items.remove(product);
        Products=items.getSize();
    }
    public double getTotal()
    {
        double totalPrice=0;
        ArrayList<Product> keys=items.keys();
        for(Product product:keys)
        {
          int quantity=  items.get(product);
          totalPrice+=quantity*product.price;
        }
        return totalPrice;
    }
    public void displayCart()
    {
        System.out.print("Total Products: "+Products+"\n"+items);
    }
    public Cart()
    {
        items = new HashMap();
    }
}
