package com.example.shardingsphere2.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shardingsphere2.entity.UserInfo;
import com.example.shardingsphere2.mapper.UserInfoMapper;
import com.example.shardingsphere2.service.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author breet
 * @date 2019/11/6 16:44
 * @description 用户实现类
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Override
    public boolean save(UserInfo entity) {
        return super.save(entity);
    }

    @Override
    public List<UserInfo> getUserList() {
        return baseMapper.selectList(Wrappers.<UserInfo>lambdaQuery());
    }
}
