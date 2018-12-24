package com.soft1841.sm.entity;




public class Vip {
    private Long id;
    private Long name;
    private Long sex;
    private Long Mobile;
    private Long vipNumber;
    private Long join_date;
    public Vip(){

    }
    public Vip(Long id, Long name, Long sex, Long Mobile, Long vipNumber, Long join_date){
     setId(id);
     setName(name);
     setSex(sex);
     setMobile(Mobile);
     setVipNumber(vipNumber);
     setJoin_date(join_date);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Long getMobile() {
        return Mobile;
    }

    public void setMobile(Long mobile) {
        Mobile = mobile;
    }

    public Long getVipNumber() {
        return vipNumber;
    }

    public void setVipNumber(Long vipNumber) {
        this.vipNumber = vipNumber;
    }

    public Long getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Long join_date) {
        this.join_date = join_date;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "id=" + id +
                ", name=" + name +
                ", sex=" + sex +
                ", Mobile=" + Mobile +
                ", vipNumber=" + vipNumber +
                ", join_date=" + join_date +
                '}';
    }
}
