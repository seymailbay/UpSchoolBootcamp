package FProgramlama.Odev2;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {


        List<Book> books = BookFactory.getBookList();
        Book book1 = books.get(2);
        Book book2 = books.get(3);

        System.out.println(book1);
        System.out.println(book2);

        Comparator<Book> comparator2 = (o1, o2) -> o1.getPages() - o2.getPages();

       /* Comparator<Book> comparator2 = (o1, o2) -> {
            if (o1.getPages() > o2.getPages()) {
                return 1;
            } else if (o1.getPages() == o2.getPages()) {
                return 0;

            } else {
                return -1;
            }

        }; */

        BinaryOperator<Book> maxLengthPage = BinaryOperator.maxBy(comparator2);

        Book temp = maxLengthPage.apply(book1, book2);

        System.out.println(temp);


    }


}


