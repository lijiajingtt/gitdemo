package com.soft1841.sm.service;

import com.soft1841.sm.entity.Vip;

import java.util.List;

public interface VipService {
    List<Vip> getAllVip();

    Long addVip (Vip vip);
    void deleteVip(long id);
}
