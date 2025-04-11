package ComparableExamples;

public class Laptop implements Comparable{
    Double rating;
    String brand;
    int year;
    String model;

    @Override
    public String toString() {
        return "Laptop{" +
                "rating=" + rating +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }

    Laptop(Double rating, String brand, int year, String model) {
        this.rating = rating;
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    @Override
    public int compareTo(Object o) {
    Laptop l=(Laptop)o;
    if(this.year!=l.year){
        return this.year-l.year;
    }
    else
        return this.rating.compareTo(l.rating);
    }
}
