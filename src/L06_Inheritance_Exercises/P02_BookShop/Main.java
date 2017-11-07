package L06_Inheritance_Exercises.P02_BookShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalClassFormatException, IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String author = br.readLine();
            String title = br.readLine();
            double price = Double.parseDouble(br.readLine());
            
            Book book = new Book(author,
                    title,
                    price);
            
            GoldenEditionBook goldenEditionBook =
                    new GoldenEditionBook(author,
                            title,
                            price);
            
            Method[] bookDeclaredMethods = Book.class.getDeclaredMethods();
            Method[] goldenBookDeclaredMethods =
                    GoldenEditionBook.class.getDeclaredMethods();
            
            if (goldenBookDeclaredMethods.length > 1) {
                throw new IllegalClassFormatException(
                        "Code duplication in GoldenEditionBook!");
            }
            
            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());
            
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
