import models.Book;
import models.Notebook;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Book book = new Book(396);
        System.out.println("Количество страниц в книге " + book.getNumberOfPages());
        System.out.println("Количество листов А4 необходимых для печати " + book.getTotalNumberOfPages());

        int currentPage = 0;
        List<Integer> oddlist = new ArrayList<>();//  не  четные
        List<Integer> evenlist = new ArrayList<>();//четные

        int loadFactor = 16;

        int oddFirstFirstPage = 1;
        int oddFirstPage = oddFirstFirstPage;
        int oddLastLastPage = loadFactor;
        int oddLastPage = oddLastLastPage;

        int evenFirstFirstPage = 2;
        int evenFirstPage = evenFirstFirstPage;
        int eventLastLastPage = loadFactor - 1;
        int evenLastPage = eventLastLastPage;


        for (int k = 0; k < (book.getNumberOfPages() / 16); k++) {

            for (int i = 0; i < (loadFactor / 4); i++) {
                oddlist.add(oddLastPage);
                oddlist.add(oddFirstPage);
                oddLastPage -= 2;
                oddFirstPage += 2;


            }

            oddFirstPage = oddFirstFirstPage = oddFirstFirstPage += loadFactor;
            oddLastPage = oddLastLastPage = oddLastLastPage += loadFactor;


            for (int j = 0; j < (loadFactor / 4); j++) {
                evenlist.add(evenFirstPage);
                evenlist.add(evenLastPage);
                evenFirstPage += 2;
                evenLastPage -= 2;


            }


            evenFirstPage = evenFirstFirstPage = evenFirstFirstPage += loadFactor;
            evenLastPage = eventLastLastPage = eventLastLastPage += loadFactor;

        }

        if ((oddlist.size() - 8) < book.getNumberOfPages()) {
            System.out.println("---------------------------");
            oddlist.add(book.getNumberOfPages() - 3);
            oddlist.add(book.getNumberOfPages());
            evenlist.add(book.getNumberOfPages() - 2);
            evenlist.add(book.getNumberOfPages() - 1);

            System.out.println("Нечетная сторона " + oddlist);
            System.out.println("Четная сторона " + evenlist);

        }

        Set<Integer> oddCheck = new LinkedHashSet<>(oddlist);
        Set<Integer> evenCheck = new LinkedHashSet<>(evenlist);
        System.out.println("Проверка на повторы через Set");
        System.out.println(oddCheck);
        System.out.println(evenCheck);

    }


}
