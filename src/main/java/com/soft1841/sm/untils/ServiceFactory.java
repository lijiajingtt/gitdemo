package com.soft1841.sm.untils;


import com.soft1841.sm.service.*;
import com.soft1841.sm.service.Impl.*;

public class ServiceFactory {
    public static TypeService getTypeServiceInstance() { return new TypeServiceImpl(); }
    public static SellerService getSellerServiceInstance()
    {
        return  new SellerServiceImpl();
}
    public static AdminServiceImpl getAdminServiceInstance()
    {
        return new AdminServiceImpl();
    }
    public static VipService getVipDAOInstance(){return  new VipServiceImpl(); }
    public static GoodsService getGoodsServiceInstance(){
      return new GoodsServiceImpl();
    }
    public static SellerGoodsService getSellerGoodsServiceInstance() {return new SellerGoodsServiceImpl();  }
}


