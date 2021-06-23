package com.accenture.crear;

import com.accenture.dao.InstanceDao;
import com.accenture.dao.QuoteDao;
import com.accenture.hibernate.Instance;
import com.accenture.hibernate.Quote;


import java.time.LocalDate;
import java.util.List;

public class Crear {

    public static void main(String[] args) {

        InstanceDao newInstance = new InstanceDao();
        QuoteDao newQuote = new QuoteDao();

        Instance instance = new Instance();
        Instance instance2 = new Instance();

        Quote quote = new Quote();
        Quote quote2 = new Quote();

        quote.setCreateDate(LocalDate.of(2003,10,28));
        quote.setOrderNumber("1789926638");
        quote.setUseDate(LocalDate.of(2011,9,17));

        quote2.setCreateDate(LocalDate.of(2011,5,2));
        quote2.setOrderNumber("768964357");
        quote2.setUseDate(LocalDate.of(2015,11,1));

        instance.setOffNet("off");
        instance.setType("metro");
        instance.setQuoteNumeber(quote);

        instance2.setOffNet("off");
        instance2.setType("Fibra");
        instance2.setQuoteNumeber(quote2);

        newQuote.insert(quote);
        newInstance.insert(instance);

        newQuote.insert(quote2);
        newInstance.insert(instance2);



        System.out.println("Quote");
        System.out.println(newQuote.list());

        System.out.println("Instance");
        System.out.println(newInstance.list());

        newInstance.close();
        newQuote.close();


    }
    private static void  print(List collection){
        for (Object aux: collection) {
            System.out.println(aux.toString());
        }

    }
}
