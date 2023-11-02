package homework.library;

    interface Library {
        void addBook(Book book);
        void removeBook(String ISBN);
        Book findBook(String ISBN);
        int getBook();

        int getBookCount();

        void printBooks();
    }


