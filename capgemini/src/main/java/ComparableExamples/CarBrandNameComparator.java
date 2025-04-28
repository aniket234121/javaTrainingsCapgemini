package ComparableExamples;

import com.scoping.Car;

import java.util.Comparator;

public class CarBrandNameComparator implements Comparator<Car> {
    public int compare(Car o1, Car o2) {
        return o1.getBrandName().compareToIgnoreCase(o2.getBrandName());
    }
}
