//HW - 04 - 01
//Створіть проект з класом Main.java.
////Потрібно: Створити клас Book. Створити класи Title, Author та Content,
// кожен з яких повинен містити одне рядкове поле та метод void show().
// Реалізувати можливість додавання назви книги, імені автора та змісту.
// Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.
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
