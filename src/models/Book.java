package models;

import java.util.Objects;

public class Book {

    public Book() {
    }

    //Общее количество страниц должно быть кратным 4 - если нет - нужно добавить пустые в конец
    private int numberOfPages;

    public Book(int numberOfPages) {
        while (numberOfPages % 4 != 0) {
            numberOfPages++;
        }
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }


    private int numberOfNotebooksInTheBook;//Количество тетрадей в книге = общее количество страниц разделить на 16

    public int getNumberOfNotebooksInTheBook() {
        return numberOfPages / new Notebook().getNumberOfSheetsInANotebook();
    }


    private int numberOfPagesPerSheet;//Количество страниц на одном листе = должно быть кратным 4 (по 2 с обеих сторон)

    public int getNumberOfPagesPerSheet() {
        return numberOfPagesPerSheet;
    }

    public void setNumberOfPagesPerSheet(int numberOfPagesPerSheet) {
        this.numberOfPagesPerSheet = numberOfPagesPerSheet;
    }

    private int totalNumberOfPages; //количество листов необходимое для печати

    public int getTotalNumberOfPages() {
        return numberOfPages / 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages &&
                numberOfNotebooksInTheBook == book.numberOfNotebooksInTheBook &&
                numberOfPagesPerSheet == book.numberOfPagesPerSheet &&
                totalNumberOfPages == book.totalNumberOfPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPages, numberOfNotebooksInTheBook, numberOfPagesPerSheet, totalNumberOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", numberOfNotebooksInTheBook=" + numberOfNotebooksInTheBook +
                ", numberOfPagesPerSheet=" + numberOfPagesPerSheet +
                ", totalNumberOfPages=" + totalNumberOfPages +
                '}';
    }
}
