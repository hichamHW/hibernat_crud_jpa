import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class test {


    public  static  void  main(String[] args){


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        student s = new student();

        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            s= em.find(student.class,7);

            System.out.println(s.getId() + "      "+s.getName());


            em.getTransaction().commit();

        }catch (Exception e)
        {

        }



        emf.close();
    }
}
