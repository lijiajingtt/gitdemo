package com.soft1841.sm.dao.impl;


import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.entity.Admin;

import java.sql.SQLException;

public class AdminDAOImpl implements AdminDAO {
    @Override
    public Admin getAdminByNumber(String admin_number) throws SQLException {
        Entity entity =  Db.use().queryOne("SELECT * FROM t_admin WHERE admin_number = ? ",admin_number );
        return convertAdmin(entity);
    }
    private Admin convertAdmin(Entity entity) {
        Admin admin =  new Admin(entity.getLong("id"),entity.getStr("name"),
                entity.getStr("admin_number"),entity.getStr("password"));
        return admin;

    }
}
