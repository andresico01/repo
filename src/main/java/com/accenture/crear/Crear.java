package com.accenture.crear;

import com.accenture.hibernate.Instance;
import com.accenture.hibernate.Quote;
import net.bytebuddy.pool.TypePool;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Crear {
    private static final String PU = "HibernateJpaMYSQLPU";
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Instance instance = new Instance();
        instance.setOffNet("hola");
        instance.setType("tipo");
        Quote quote = new Quote();
        quote.setCreateDate("2040-12-1");
        quote.setOrderNumber("order");
        instance.setQuoteNumeber(quote);

        em.persist(instance);
        em.persist(quote);
        em.getTransaction().commit();

        em.close();
        emf.close();


    }
}
