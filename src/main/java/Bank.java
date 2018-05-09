import javax.persistence.*;

@Entity
@Table(name = "banks_table")

public class Bank {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementator")
    private int id;

    @Column(name = "name")
    private String name;


}
