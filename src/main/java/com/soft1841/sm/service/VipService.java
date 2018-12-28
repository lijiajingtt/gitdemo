package com.soft1841.sm.service;

import com.soft1841.sm.entity.Vip;

import java.util.List;

public interface VipService {
    /**
     * 查询所有会员
     * @return
     */
    List<Vip> getAllVip();

    /**
     * 新增一个会员，返回自增主键
     * @param vip
     * @return
     */
    long addVip(Vip vip);
    void deleteVip(long id);
}
