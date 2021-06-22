package com.accenture.dao;

import com.accenture.hibernate.Quote;

import javax.persistence.Query;
import java.util.List;

public class QuoteDao extends GenericDao{


    public List<Quote> list() {

        String consult = "SELECT q FROM Quote q";
        em = getEntityManager();

        Query query = em.createQuery(consult);

        return query.getResultList();
    }

    public Quote idFind(Integer idQuote) {
        em = getEntityManager();
        return em.find(Quote.class,idQuote);


    }

    public void upDate(Quote quote ) {
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(quote);
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }




    public void insert(Quote quote) {
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(quote);
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }


}
