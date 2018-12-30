package com.soft1841.sm.dao;

import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.untils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDAOTest {
private AdminDAO adminDAO = DAOFactory.getAdminDAOInstance();
    @Test
    public void getAdminByNumber() throws SQLException {
        Admin admin = adminDAO.getAdminByNumber("1");
        System.out.println(admin);
    }
}