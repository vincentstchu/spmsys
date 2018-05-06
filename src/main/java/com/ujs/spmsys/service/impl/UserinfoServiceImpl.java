package com.ujs.spmsys.service.impl;

import com.ujs.spmsys.dao.AccountMapper;
import com.ujs.spmsys.dao.UserinfoMapper;
import com.ujs.spmsys.entity.Account;
import com.ujs.spmsys.entity.Userinfo;
import com.ujs.spmsys.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Project: spmsys
 * Package: com.ujs.spmsys.service.impl
 * Author: vincent
 * Date: 18-4-15
 * Time: 上午10:39
 */
@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    UserinfoMapper userinfoMapper;

    @Autowired
    AccountMapper accountMapper;

    @Override
    public void save(Userinfo entity) {
        userinfoMapper.insert(entity);
        Account a = accountMapper.selectByPrimaryKey(entity.getAccountid());
        a.setStatus(1);
        accountMapper.updateByPrimaryKey(a);
    }

    @Override
    public void deleteById(Integer id) {
        userinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Userinfo model) {
        userinfoMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public List<Userinfo> findAll() {
        return null;
    }

    @Override
    public Userinfo findById(Integer id) {
        return userinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Userinfo> findByCondition(Condition condition) {
        return null;
    }
}
