package com.soft1841.sm.dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.entity.Vip;
import java.sql.SQLException;
import java.util.List;

public interface VipDAO {
    /**
     * 根据工号查询收银员
     * @param vipNumber
     * @return
     * @throws SQLException
     */
    Vip getVipByNumber(String vipNumber) throws SQLException;
}

