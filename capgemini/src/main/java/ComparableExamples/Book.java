package ComparableExamples;

public class Book{
int rating;
String title;
Double price;

    public Book(int rating, String title, double price) {
        this.rating = rating;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nrating :"+rating+" title :"+title+" price :"+price;
    }
//    public int compareTo(Object o) {
//        Book b = (Book) o;
//        if(this.rating!=b.rating)
//        {
//            return this.rating-b.rating;
//        }
//        else return this.price.compareTo(b.price);
//    }
}
