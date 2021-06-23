package com.accenture.crear;

import com.accenture.dao.InstanceDao;
import com.accenture.dao.QuoteDao;
import com.accenture.hibernate.Instance;
import com.accenture.hibernate.Quote;
import java.time.LocalDate;


public class Cambios {

    public static void main(String[] args) {

        QuoteDao data = new QuoteDao();
        Quote newQuote = data.idFind(1);
        System.out.println(newQuote);
        newQuote.setOrderNumber("1717289276");
        newQuote.setUseDate(LocalDate.of(2013,5,11));
        newQuote.setCreateDate(LocalDate.of(2011,10,21));
        data.upDate(newQuote);
        InstanceDao dataInstanc = new InstanceDao();
        Instance newInstance = dataInstanc.idFind(6);
        newInstance.setType("Fibra");
        dataInstanc.upDate(newInstance);
        System.out.println(newInstance);






    }


}
