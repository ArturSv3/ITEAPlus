package Book;

import static Book.Book.show;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Book's name, Author's name and what that book about.");
        String titleName = scanner.nextLine();
        String authorName = scanner.nextLine();
        String Content = scanner.nextLine();

        show(titleName, authorName, Content);
    }
}
