package com.infotech.ElectricityBills.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "bill")
public class Bills{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "prop")
    private String prop;

    @Column(name = "password")
    private String password;

    @Column(name = "units")
    private int units;

    @Column(name = "amount")
    private int amount;

    @Column(name = "payment")
    private String payment;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Bills(Long userId, String userName, String prop, String password, int units, int amount, String payment) {
        this.userId = userId;
        this.userName = userName;
        this.prop = prop;
        this.password = password;
        this.units = units;
        this.amount = amount;
        this.payment = payment;
    }

    public Bills() {
    }

    @Override
    public String toString() {
        return "Bills{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", prop='" + prop + '\'' +
                ", password='" + password + '\'' +
                ", units=" + units +
                ", amount=" + amount +
                ", payment='" + payment + '\'' +
                '}';
    }

}
