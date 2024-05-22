package org.example.application;

import org.example.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String []args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.example");
        EntityManager em = emf.createEntityManager();

        Person p1 = new Person(null, "Isaque", "isaquesantos.1998@gmail.com");
        Person p2 = new Person(null, "Eliseu", "elispdam.1999@gmail.com");
        Person p3 = new Person(null, "Cleidiane", "clei!123@gmail.com");
        Person p4 = new Person(null, "Teste", "teste@gmail.com");


        /* Finding */
        // Person p = em.find(Person.class, 4);
        // System.out.println(p);

        /* Remove */
        Person p = em.find(Person.class, 4);
        em.remove(p);

        /* Inserting */
        // em.persist(p1);
        // em.persist(p2);
        // em.persist(p3);
        // em.persist(p4);

        em.getTransaction().begin();
        em.getTransaction().commit();

        emf.close();
        em.close();

        System.out.print("Pronto");
    }
}
