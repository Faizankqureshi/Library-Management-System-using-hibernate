import BOOKDAO.java.BOOKDAO;
 import BOOKDAO.java.Book;
//import java.awt.print.Book;
import java.util.Scanner;

public class LMS {

    public static  void main(String[]args){

        BOOKDAO bookdao = new BOOKDAO();
        Scanner scaner = new Scanner(System.in);

        while(true){

            System.out.println("1.add book");
            System.out.println("2.view all book");
            System.out.println("3.update");
            System.out.println("4.delet");
            System.out.println("exit");
            int chhoice = scaner.nextInt();

            switch (chhoice)

            {

                case 1:

                    Book book = new Book();
                    System.out.println("biik title");
                    book.setTitle(scaner.next());
                    System.out.println("book authoer");
                    book.setAuthor(scaner.next());
                    System.out.println("isbn");
                    book.setIsbn(scaner.next());
                    book.setAvailable(true);
                    BOOKDAO.addbook(book);

                    break;

                case 2:
                    bookdao.getAllBooks();
                   // BOOKDAO.getAllBooks().forEach(System.out);

                   // Airf.getAllBooks().forEach(System.out::println);

                    break;

                case 3:
                    break;

                case 4:

                    System.out.println("enter id");
                    int id =scaner.nextInt();
                    BOOKDAO.deletBook(id);

                    break;

                case 5:

                    System.exit(0);

                    break;

            }
        }

    }
}