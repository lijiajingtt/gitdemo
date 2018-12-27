package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Goods;

import java.sql.SQLException;
import java.util.List;

public interface SellerGoodsDAO {
    List<Goods>getAllGoods() throws SQLException;
}
