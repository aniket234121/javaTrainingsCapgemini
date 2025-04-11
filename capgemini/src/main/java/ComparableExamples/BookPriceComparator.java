package ComparableExamples;

import java.util.Comparator;

public class BookPriceComparator implements Comparator {
public int compare(Object o1, Object o2) {
    Book b1=(Book)o1;
    Book b2=(Book)o2;
    return Double.compare(b1.price,b2.price);
}
}
