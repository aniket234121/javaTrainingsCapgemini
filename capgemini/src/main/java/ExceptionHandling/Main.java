package ExceptionHandling;

import Abstraction.Interfaces.ExampleImplementation;

import java.util.Scanner;

public class Main {

    public static int checkNegative(int price)
    {



        try {
            if (price < 0) {
                throw new NegativePriceException();
            }else
            {
                return price;
            }
        }
        catch(Exception e)
            {
                System.out.println(e.getMessage());
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter the valid product price");
                return checkNegative(scanner.nextInt());
            }

    }

    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of the product");
        product.price=checkNegative(sc.nextInt());
        System.out.println("Enter the type of the product");
        product.type=sc.next();

        System.out.println(product);
    }
}
