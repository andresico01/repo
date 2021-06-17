package com.accenture.test;


import com.accenture.dao.QuoteDao;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("Instancia");
        try{

        QuoteDao quoteDao = new QuoteDao();



        print(quoteDao.list());
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }

    private static void  print(List collection){

        for (Object obj : collection){
            System.out.println("valor :"+obj);
        }


    }
}
