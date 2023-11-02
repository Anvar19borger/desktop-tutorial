package homewoork.model1;

public class Book {
    //Polja
    private String title;
    private String author;
    private int year;
    private String ISBN;
    //Kanstrucktoor

    public Book(String title, String author, int year, String ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
    }

    // Getorii i setori
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    //Metod display dlja informacii o knige
    public void display() {
        System.out.println("Nasvanie : " + title);
        System.out.println("Avtor : " + author);
        System.out.println("God isdanija : " + year);
        System.out.println("ISBN : " + ISBN);
    }
}
