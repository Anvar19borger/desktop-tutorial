package homewoork.model1;

public class BookAppl {
    public static void main(String[] args) {
        // Sosdal 2 knigi i slovarja
        Book book1 = new Book("Azasel", "Boris Akunin", 1998, "978-5-8159-1724-8");

        Dictionary dictionary1 = new Dictionary("Oxford English Dictionary", "Oxford University Press", 1884,
                "0-19-861186-2", "English", 600000);

        Book book2 = new Book("Prestuplenie i nakasanie", "Feder Dostoeevskii", 1866, "978-5-389-02914-0");

        Dictionary dictionary2 = new Dictionary("Collins French Dictionary", "Collins",
                2007, "978-0-00-722078-8", "French", 80000);

        // Vivoju informaciju oknigach i slovarjach
        System.out.println("Informacija o knige 1:");
        book1.display();
        System.out.println("___________________________________________________________________________________________");

        System.out.println("Informacija o slovare 1:");
        dictionary1.display();

        System.out.println("__________________________________________________________________________________________");
        System.out.println("Informacija o knige 2:");
        book2.display();
        System.out.println("___________________________________________________________________________________________");

        System.out.println("Infarmacija o slovare 2:");
        dictionary2.display();
    }
}
