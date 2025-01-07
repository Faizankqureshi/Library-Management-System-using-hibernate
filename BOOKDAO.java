package BOOKDAO.java;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import java.awt.print.Book;

import static java.lang.reflect.Array.get;

public class BOOKDAO<session> {

        public static List <Book>  getAllBooks(){

            Session session = (Session) new Configuration().configure().buildSessionFactory().openSession();
            List<Book> book =session.createQuery("from",Book.class).list();
            Transaction.commit();
            session.forceClose();
            return book;

        }

        public void updte(Book book){

            Session session = (Session) new Configuration().configure().buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();session.
            session.update(book);
            transaction.commit();
            session.forceClose();

        }

        public static void deletBook(int book_id){

            Session session = (Session) new Configuration().configure().buildSessionFactory().openSession();
            Transaction tansaction =   session.getTransaction().begin();
            Book book =session.find(Book.class,book_id);
            if(book!=null) session.delete(book);session.remove(book);
            Transaction.commit();
            session.forceClose();

        }

    public static void addbook(Book book) {
        Session session = (Session) new Configuration().configure().buildSessionFactory().openSession();
        Transaction transaction = session.BeginTransaction();
        session.Persist(book);
        transaction.commit();
        session.forceClose();
    }
}

