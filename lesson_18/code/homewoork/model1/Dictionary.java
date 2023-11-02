package homewoork.model1;

public class Dictionary extends Book {
    private String language;// polja
    private int numberOfEntries;
   // Kanstruktor

    public Dictionary(String title, String author, int year, String ISBN, String language, int numberOfEntries) {
        super(title, author, year, ISBN);
        this.language = language;
        this.numberOfEntries = numberOfEntries;
    }

    // Getari i settari
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    // Metod display

    public void display() {
        super.display();
        System.out.println("Jasik: " + language);
        System.out.println("Kolichestvo statei: " + numberOfEntries);
    }
}
