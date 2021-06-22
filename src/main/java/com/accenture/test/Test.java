package com.accenture.test;


import com.accenture.dao.InstanceDao;
import com.accenture.dao.QuoteDao;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("Inicio");
        try{
            System.out.println("Quote");
            QuoteDao quoteDao = new QuoteDao();
            print(quoteDao.list());


            System.out.println("Instancia");
            InstanceDao instanceDao = new InstanceDao();
            print(instanceDao.list());

        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }

    private static void  print(List collection){
        for (Object aux: collection) {
            System.out.println(aux.toString());
        }

    }

}
