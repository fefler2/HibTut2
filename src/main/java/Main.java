
import javax.persistence.*;

public class Main {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("org.hibernate.tutorial.jpa");

    }
}

//        Client client = new Client();
//        client.setId(2);
//        client.setName("bob");
//
//        Bank bank = new Bank();
//        bank.setName("wells fergo");


//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(client);
//        entityManager.persist(bank);
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//
//
//    }
//}
