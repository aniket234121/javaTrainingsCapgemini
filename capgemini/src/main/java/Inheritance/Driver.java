package Inheritance;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        System.out.println("1. Bike \n2. Sedan \n3. Auto");
        Scanner scanner = new Scanner(System.in);
        int option=scanner.nextInt();
        Cab cab=null;
        switch(option)
        {
            case 1: {
                cab = new Bike("bike");
                break;
            }
            case 2: {
                cab = new Sedan("sedan");
                break;
            }
            case 3: {
                cab = new Auto("auto");
                break;
            }
            default: {
                System.out.println("Invalid option");
            }
        }

        if(cab instanceof Bike)
        {
            Bike bike = (Bike)cab;
            System.out.println(bike.type+" "+bike.price);
        }
        if(cab instanceof Auto)
        {
           Auto auto = (Auto)cab;
            System.out.println(auto.type+" "+auto.price);
        }
        if(cab instanceof Sedan)
        {
            Sedan sedan = (Sedan)cab;
            System.out.println(sedan.type+" "+sedan.price);
        }
    }
}
