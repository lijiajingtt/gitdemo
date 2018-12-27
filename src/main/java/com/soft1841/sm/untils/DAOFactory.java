package com.soft1841.sm.untils;
import com.soft1841.sm.dao.*;
import com.soft1841.sm.dao.impl.*;

public class DAOFactory {
    public static SellerDAO getSellerDAOInstance() {
        return new SellerDAOImpl();
    }

    public static AdminDAO getAdminDAOInstance() {
        return new AdminDAOImpl();
    }

    public static TypeDAO getTypeDAOInstance() { return new TypeDAOImpl();
    }
    public static GoodsDAO getGoodsDAOInstance(){
       return new GoodsDAOImpl();
    }
}


