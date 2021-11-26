package com.infotech.ElectricityBills.controller;

public class UpdateUser {
    private Long id;
    private String password;
    private String prop;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "UpdateUser{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", prop='" + prop + '\'' +
                '}';
    }
}
