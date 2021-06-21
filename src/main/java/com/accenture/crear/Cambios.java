package com.accenture.crear;public class Cambios {
      private static final String PU = "HibernateJpaMYSQLPU";
    public static void main(String[] args) {
        System.out.println("Busqueda de datos en DB ");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        QuoteDao data = new QuoteDao();
        Quote newQuote = data.idFind(1);
        System.out.println(newQuote.toString());
        newQuote.setOrderNumber("6717289276");
        newQuote.setUseDate(LocalDate.of(2013,5,11));
        newQuote.setCreateDate(LocalDate.of(2011,10,21));
        data.upDate(newQuote);
        InstanceDao dataInstanc = new InstanceDao();
        Instance newInstance = dataInstanc.idFind(6);
        System.out.println(newInstance.toString());
        em.close();
        emf.close();





    }


}
