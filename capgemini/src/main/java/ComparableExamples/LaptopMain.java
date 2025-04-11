package ComparableExamples;

import java.util.Arrays;

public class LaptopMain {
    public static void main(String[] args) {

        Laptop []laptops=new Laptop[5];
        laptops[0]=new Laptop(4.5,"asus",2002,"asdfa");
        laptops[1]=new Laptop(4.3,"asus",2002,"pad");
        laptops[2]=new Laptop(4.2,"acer",2000,"vivobook");
        laptops[3]=new Laptop(4.1,"acer",2000," arm");
        laptops[4]=new Laptop(4.0   ,"dell",2000," mark");
        System.out.println(Arrays.toString(laptops));
        Arrays.sort(laptops);
        System.out.println(Arrays.toString(laptops));
    }
}
