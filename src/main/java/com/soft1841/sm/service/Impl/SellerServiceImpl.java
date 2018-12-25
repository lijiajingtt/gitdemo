package com.soft1841.sm.service.Impl;
import com.soft1841.sm.dao.SellerDAO;
import com.soft1841.sm.entity.Seller;
import com.soft1841.sm.service.SellerService;
import com.soft1841.sm.untils.DAOFactory;


import java.sql.SQLException;

public class SellerServiceImpl implements SellerService {
    private SellerDAO sellerDAO = DAOFactory.getSellerDAOInstance();
    @Override
    public boolean login(String number, String password) {
        Seller seller = null;
        try {
            seller = sellerDAO.getSellerByNumber(number);
            //！
            System.out.println(seller.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //根据工号查找成功
        if (seller != null) {
            //比较密码
            if (password.equals(seller.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
