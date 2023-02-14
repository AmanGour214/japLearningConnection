package com.UstendingJPAandHybernate.testingJpa2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_info")
public class User {

    @Id // it is writtn on that attribute which has to become primary key;
    private int id;// this is primary key

    private String name;

    private String age;

    private String mobileNO;

    @Column(name = "Email",unique = true)// it is usd to given the name to the column and also we kept it unique also;

    private String email;
    @Column(name="Country_name")
    private String country;

    public User() {
    }

    public User(int id, String name, String age,String mobileNO) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNO=mobileNO;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
