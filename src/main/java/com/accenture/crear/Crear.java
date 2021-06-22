package com.accenture.crear;

import com.accenture.dao.InstanceDao;
import com.accenture.dao.QuoteDao;
import com.accenture.hibernate.Instance;
import com.accenture.hibernate.Quote;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Crear {
   // private static final String PU = "HibernateJpaMYSQLPU";
    public static void main(String[] args) {
     /*   EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
*/
        InstanceDao newInstance = new InstanceDao();
        QuoteDao newQuote = new QuoteDao();

        Instance instance = new Instance();

        Quote quote = new Quote();
        quote.setCreateDate(LocalDate.of(2003,10,28));
        quote.setOrderNumber("1789926638");
        quote.setUseDate(LocalDate.of(2011,9,17));
        instance.setOffNet("off");
        instance.setType("metro");
        instance.setQuoteNumeber(quote);

        newQuote.insert(quote);
        newInstance.insert(instance);

        //em.close();
       // emf.close();


    }
}
