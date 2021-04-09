package com.lambdaschool.piggybank.models;
import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;
    private String name;
    private String namepl;
    private double value;
    private int quantity;

    public Coin(String name, String namepl, double value, int quantity) {
        this.name = name;
        this.namepl = namepl;
        this.value = value;
        this.quantity = quantity;
    }

    public Coin() {
    }

    public long getCoinid() {
        return coinid;
    }

    public void setCoinid(long coinid) {
        this.coinid = coinid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamepl() {
        return namepl;
    }

    public void setNamepl(String namepl) {
        this.namepl = namepl;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
