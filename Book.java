package scann;
import java.util.Scanner;

class BookName {
    public void Title(String Title) {
        System.out.println(Title);
    }
    public void Auth(String Author) {
        System.out.println(Author);
    }
    public void Pri(int Price) {
        System.out.println(Price);
    }
    public void Page(int Pages) {
        System.out.println(Pages);
        if (Pages >= 500) {
            System.out.println("This is Expensive");
        } 
        else {
            System.out.println("This is not Expensive");
        }
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookName Book1 = new BookName();

        System.out.println("Title of Book");
        String title = scanner.nextLine();

        System.out.println("Author of Book");
        String author = scanner.nextLine();

        System.out.println("Price of Book");
        int price = scanner.nextInt();

        System.out.println("Number of Pages");
        int pages = scanner.nextInt();

        Book1.Title(title);
        Book1.Auth(author);
        Book1.Pri(price);
        Book1.Page(pages);
    }
}
