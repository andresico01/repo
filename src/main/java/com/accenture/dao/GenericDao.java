package com.accenture.dao;

import javax.persistence.*;

public abstract class GenericDao {

    protected  static EntityManager em;
    private static EntityManagerFactory emf;
    private static final String PU = "HibernateJpaMYSQLPU";

    public GenericDao(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PU);
        }
    }
    protected EntityManager getEntityManager(){
        if(em == null){
            em = emf.createEntityManager();
        }
        return em;
    }

}
