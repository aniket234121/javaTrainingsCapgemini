package Collections;

import ComparableExamples.CarBrandNameComparator;
import com.scoping.Car;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        CarBrandNameComparator carBrandNameComparator = new CarBrandNameComparator();
        TreeSet<Car> cars=new TreeSet<>(carBrandNameComparator);
        cars.add(new Car("2025","toyota","asda"));
        cars.add(new Car("2020","Bmw","asda"));
        cars.add(new Car("2019","audi","asda"));
        cars.add(new Car("2015","suzuki","asda"));
        System.out.println(cars);
        System.out.println(cars.first());
        System.out.println(cars.last());
    }
}
