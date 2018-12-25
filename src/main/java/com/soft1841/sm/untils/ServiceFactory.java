package com.soft1841.sm.untils;

import com.soft1841.sm.service.Impl.AdminServiceImpl;
import com.soft1841.sm.service.Impl.SellerServiceImpl;
import com.soft1841.sm.service.SellerService;

public class ServiceFactory {
    public static SellerService getSellerServiceInstance() {
        return  new SellerServiceImpl();
}
    public static AdminServiceImpl getAdminServiceInstance(){
        return new AdminServiceImpl();
    }
}
