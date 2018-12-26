package com.soft1841.sm.dao;

import com.soft1841.sm.dao.SellerDAO;
import com.soft1841.sm.entity.Seller;
import com.soft1841.sm.untils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class SellerDAOTest {
private SellerDAO sellerDAO = DAOFactory.getSellerDAOInstance();
    @Test
    public void getSellerByNumber() throws SQLException {
        Seller seller = sellerDAO.getSellerByNumber("666001");
        System.out.println(seller);
    }
}