package models;

public class Notebook {
    private int firstPageInNotebook; // Первая страница в текущей тетради , в начале == 1;

    public int getFirstPageInNotebook() {
        return firstPageInNotebook;
    }

    public void setFirstPageInNotebook(int firstPageInNotebook) {
        this.firstPageInNotebook = firstPageInNotebook;
    }

    private int lastPageInNotebook; // Последняя страница  тетради - обязательно четная и кратна 16;

    public int getLastPageInNotebook() {
        return lastPageInNotebook;
    }

    public void setLastPageInNotebook(int lastPageInNotebook) {
        this.lastPageInNotebook = lastPageInNotebook;
    }

    private int numberOfSheetsInANotebook;//количество страниц в одной тетради = 16

    public int getNumberOfSheetsInANotebook() {
        return numberOfSheetsInANotebook;
    }

    public void setNumberOfSheetsInANotebook(int numberOfSheetsInANotebook) {
        this.numberOfSheetsInANotebook = numberOfSheetsInANotebook;
    }
}
