package com.accenture.hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.BitSet;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Quote implements Serializable {
    private static final long serialVersionType = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_quote")
    private Integer idQuote;

    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "tdg")
    private boolean TDG = true;

    @Column(name = "use_date")
    private LocalDate useDate;

    @OneToMany(mappedBy = "quoteNumber")
    private List<Instance> instances;



    public  Quote(){

    }
    public Quote(Integer idQuote) {

        this.idQuote = idQuote;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public void setIdQuote(Integer idQuote) {
        this.idQuote = idQuote;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public void setTDG(boolean TDG) {
        this.TDG = TDG;
    }

    public void setUseDate(LocalDate useDate) {
        this.useDate = useDate;
    }

    public static long getSerialVersionType() {
        return serialVersionType;
    }

    public Integer getIdQuote() {
        return idQuote;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCreateDate() {
        return createDate.toString();
    }

    public boolean isTDG() {
        return TDG;
    }

    public String getUseDate() {
        return useDate.toString();
    }

    public List<Instance> getInstances() {
        return instances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote = (Quote) o;
        return Objects.equals(idQuote, quote.idQuote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuote);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "idQuote=" + idQuote +
                ", orderNumber='" + orderNumber + '\'' +
                ", createDate='" + createDate + '\'' +
                ", TDG=" + TDG +
                ", useDate='" + useDate + '\'' +
                '}';
    }
}
