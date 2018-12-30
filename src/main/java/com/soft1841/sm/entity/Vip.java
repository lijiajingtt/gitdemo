package com.soft1841.sm.entity;


import java.util.Date;

public class Vip {
    private Long id;
    private String name;
    private String sex;
    private String Mobile;
    private String vipnumber;
    private Date join_date;

    public Vip() {

    }

    public Vip(Long id, String name, String sex, String mobile, String vipnumber, Date join_date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.Mobile = mobile;
        this.vipnumber = vipnumber;
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

    public String getVipnumber() {
        return vipnumber;
    }

    public void setVipnumber(String vipnumber) {
        this.vipnumber = vipnumber;
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
                ", vipnumber='" + vipnumber + '\'' +
                ", join_date=" + join_date +
                '}';
    }
}
