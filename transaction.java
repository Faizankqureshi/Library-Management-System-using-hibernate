import BOOKDAO.java.Book;

import javax.persistence.*;
import java.lang.reflect.Member;

@Entity
@Table(name="transaction")
public class transaction<issuedate, date> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Temporal(TemporalType.DATE)
    private issuedate issuedate;

    @Temporal(TemporalType.DATE)
    private date date;


}