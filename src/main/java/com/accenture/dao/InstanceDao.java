package com.accenture.dao;

import com.accenture.hibernate.Instance;


import javax.persistence.Query;
import java.util.List;

public class InstanceDao extends GenericDao{

    public List<Instance> list() {
        String consult = "SELECT i FROM Instance i";
        em = getEntityManager();
        Query query = em.createQuery(consult);
        return query.getResultList();
    }

    public Object idFind(Instance instance) {
        em = getEntityManager();
        return em.find(Instance.class,instance.getIdInstancia());


    }

    public void upDate(Instance instance ) {
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(instance);
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }




    public void insert(Instance instance) {
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(instance);
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
    
    public void close(){
            if(em != null){
                em.close();
            }
    }


}
