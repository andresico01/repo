package com.accenture.hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Instance implements Serializable {

    private static final long serialVersionType = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_instancia")
    private Integer idInstancia;

    @JoinColumn(name = "id_quote",referencedColumnName = "id_quote")
    @ManyToOne
    private Quote quoteNumber;

    private String type;

    @Column(name = "off_net")
    private String offNet;

    public Instance(){

    }

    public Instance(Integer idInstancia) {
        this.idInstancia = idInstancia;
    }

    public void setIdInstancia(Integer idInstancia) {
        this.idInstancia = idInstancia;
    }

    public void setQuoteNumeber(Quote quoteNumeber) {
        this.quoteNumber = quoteNumeber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOffNet(String offNet) {
        this.offNet = offNet;
    }

    public static long getSerialVersionType() {
        return serialVersionType;
    }

    public Integer getIdInstancia() {
        return idInstancia;
    }

    public Quote getQuoteNumeber() {
        return quoteNumber;
    }

    public String getType() {
        return type;
    }

    public CharSequence getOffNet() {
        return offNet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instance instance = (Instance) o;
        return Objects.equals(idInstancia, instance.idInstancia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInstancia);
    }

    @Override
    public String toString() {
        return "Instance{" +
                "idInstancia=" + idInstancia +
                ", quoteNumeber=" + quoteNumber +
                ", type='" + type + '\'' +
                ", offNet=" + offNet +
                '}';
    }
}
