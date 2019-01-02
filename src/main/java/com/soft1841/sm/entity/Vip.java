package com.soft1841.sm.entity;


import java.util.Date;

public class Vip {
    private long id;
    private String name;
    private String sex;
    private String Mobile;
    private String vipnumber;


    public Vip() {

    }

    public Vip(long id, String name, String sex, String mobile, String vipnumber) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.Mobile = mobile;
        this.vipnumber = vipnumber;
    }

    public long getId() {
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

    public String getVipnumber() {
        return vipnumber;
    }

    public void setVipnumber(String vipnumber) {
        this.vipnumber = vipnumber;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", vipnumber='" + vipnumber + '\'' +
                '}';
    }
}
