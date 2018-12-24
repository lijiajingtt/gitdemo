package com.soft1841.sm.dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.entity.Vip;
import java.sql.SQLException;
import java.util.List;

public interface VipDAO {

    Long insertVip(Vip vip) throws SQLException;


    int deleteVipById(long id) throws SQLException;


    int updateVip(Vip vip) throws SQLException;

    List<Entity> selectAllVips() throws SQLException;



    Entity getVipById(long id) throws SQLException;


    List<Entity> selectVipsLike(String keywords) throws SQLException;


    List<Entity> selectVipsByTypeId(long typeId) throws SQLException;

    int countByType(long typeId) throws SQLException;

}

