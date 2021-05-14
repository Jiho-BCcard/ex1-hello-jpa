package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("simple-jpa-application");

        EntityManager em = emf.createEntityManager();
        //code

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //TODO

        List<Member> resultList = em.createQuery("Select m from Member as m ", Member.class)
                .getResultList();

        Member member = em.find(Member.class, 1L);
        member.setName("TEST2");
        //System.out.println(member.getName());
        tx.commit();
        em.close();
        emf.close();
    }
}
