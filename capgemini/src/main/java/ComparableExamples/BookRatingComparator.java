package ComparableExamples;

import java.util.Comparator;

public class BookRatingComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Book book1 = (Book) o1;
        Book book2 = (Book) o2;
    return Double.compare(book1.rating, book2.rating);
    }

}
