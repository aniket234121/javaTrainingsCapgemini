package ComparableExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Book[] books=new Book[4];
        Comparator comparator=null;
        books[0]=new Book(5,"Jack Bauer",10.5);
        books[1]=new Book(2,"raasdf",4.5);
        books[2]=new Book(3,"aillda",14.5);
        books[3]=new Book(4,"starr",190.89);
        System.out.println("based on which to sort \n1. rating 2.title 3.price");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:{
                comparator=new BookRatingComparator();
                break;}
            case 2:{
                 comparator=new BookTitleComparator();
                break;
            }
            case 3:{
                 comparator=new BookPriceComparator();
                 break;

            }
            default:{
                System.out.println("Invalid choice");

            }

        }
       if(comparator!=null)
          Arrays.sort(books,comparator);
       System.out.println(Arrays.toString(books));


    }
}
