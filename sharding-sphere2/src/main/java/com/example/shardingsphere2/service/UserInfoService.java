package com.example.shardingsphere2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shardingsphere2.entity.UserInfo;

import java.util.List;

/**
 * @author breet
 * @date 2019/11/6 16:42
 * @description
 */
public interface UserInfoService  extends IService<UserInfo> {
    /**
     * 保存用户信息
     * @param entity
     * @return
     */
    @Override
    boolean save(UserInfo entity);

    /**
     * 查询所以用户信息
     * @return
     */
    List<UserInfo> getUserList();
}
