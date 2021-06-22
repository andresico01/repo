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

    public Instance idFind(Integer idInstance) {
            em = getEntityManager();
            return em.find(Instance.class,idInstance);

    }

    public void upDate(Instance instance ) {
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(instance);
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            if(em != null){
                em.close();
            }
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
        }finally {
            if(em != null){
                em.close();

            }
        }
    }


}
