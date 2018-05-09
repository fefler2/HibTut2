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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementator")
    private int id;

}
