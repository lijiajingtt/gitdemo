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
    public Long insertVip(Vip vip) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_vip")
                        .set("id",vip.getId() )
                        .set("name",vip.getName())
                        .set("sex",vip.getSex())
                        .set("mobile",vip.getMobile() )
                        .set("vipNumber",vip.getVipNumber() )
                        .set("join_date",vip.getJoin_date())
        );
    }

    @Override
    public int deleteVipById(long id) throws SQLException {
        return Db.use().del(
                Entity.create("t_book").set("id", id)
        );
    }
    @Override
    public int updateVip(Vip vip) throws SQLException {
        return Db.use().update(
                Entity.create().set("sex",vip.getSex())
                .set("mobile",vip.getMobile()),
                Entity.create("t_vip").set("id",vip.getId())
        );
    }

    @Override
    public List<Entity> selectAllVips() throws SQLException {
        return Db.use().query("SELECT * FROM t_book ");
    }

    @Override
    public Entity getVipById(long id) throws SQLException {
        return Db.use().queryOne("SELECT * FROM t_book WHERE id = ? ", id);
    }

    @Override
    public List<Entity> selectVipsLike(String keywords) throws SQLException {
        return Db.use().findLike("t_book", "name", keywords, Condition.LikeType.Contains);
    }

    @Override
    public List<Entity> selectVipsByTypeId(long typeId) throws SQLException {
        return Db.use().query("SELECT * FROM t_book WHERE type_id = ? ", typeId);
    }

    @Override
    public int countByType(long typeId) throws SQLException {
        return Db.use().queryNumber("SELECT COUNT(*) FROM t_book WHERE type_id = ? ", typeId).intValue();
    }
}

