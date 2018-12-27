package com.soft1841.sm.dao.impl;


import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.sql.Condition;
import com.soft1841.sm.dao.VipDAO;
import com.soft1841.sm.entity.Vip;

import java.sql.SQLException;
import java.util.List;

public class VipDAOImpl implements VipDAO {

    @Override
    public Vip getVipByNumber(String vipNumber) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_vip WHERE vipNumber = ? ", vipNumber);
        return convertVip(entity);
    }

    private Vip convertVip(Entity entity) {
        Vip vip = new Vip(entity.getLong("id"), entity.getStr("name"),
                entity.getStr("vipNumber"), entity.getStr("password"));
        return vip;
    }
}