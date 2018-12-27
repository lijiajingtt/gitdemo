package com.soft1841.sm.entity;


import java.util.Date;

public class Vip {
    private Long id;
    private String name;
    private String sex;
    private String Mobile;
    private String vipNumber;
    private Date join_date;

    public Vip(Long id, String name, String vipNumber, String password) {

    }

    public Vip(Long id, String name, String sex, String Mobile, String vipNumber, Date join_date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.Mobile = Mobile;
        this.vipNumber = vipNumber;
        this.join_date = join_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getVipNumber() {
        return vipNumber;
    }

    public void setVipNumber(String vipNumber) {
        this.vipNumber = vipNumber;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", vipNumber='" + vipNumber + '\'' +
                ", join_date=" + join_date +
                '}';
    }
}
