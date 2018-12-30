package com.soft1841.sm.entity;

public class Admin {
    private Long id ;
    private String name ;
    private String admin_number ;
    private String password;

    public Admin() {
    }

    public Admin(Long id, String name, String admin_number, String password) {
        this.id = id;
        this.name = name;
        this.admin_number = admin_number;
        this.password = password;
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

    public String getAdminNumber() {
        return admin_number;
    }

    public void setAdminNumber(String adminNumber) {
        this.admin_number = admin_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adminNumber='" + admin_number + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
