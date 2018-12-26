package com.soft1841.sm.service;

import com.soft1841.sm.untils.ServiceFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellerServiceTest {
private SellerService sellerService = ServiceFactory.getSellerServiceInstance();

    @Test
    public void login() {
        boolean flag = sellerService.login("666001","001");
        System.out.println(flag);
    }
}