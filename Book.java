package Book;

public class Book {


    public String titleName;

    public class Title {
        String titleName;
    }

    public class Author {
        String authorName;
    }

    public class Content {
        String aboutBook;
    }

    static void show(String titleName, String authorName, String aboutBook) {
        System.out.println("Name of the book: " + titleName);
        System.out.println("Author of the book: " + authorName);
        System.out.println("Book about: " + aboutBook);
    }
}
