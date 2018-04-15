package com.ujs.spmsys.service.impl;

import com.ujs.spmsys.dao.AccountMapper;
import com.ujs.spmsys.entity.Account;
import com.ujs.spmsys.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account findByName(String name) {
        return accountMapper.selectByAccountname(name);
    }

    @Override
    public void save(Account entity) {
        accountMapper.insert(entity);
    }

    @Override
    public void deleteById(Integer id) {
        accountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Account model) {
        accountMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account findById(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Account> findByCondition(Condition condition) {
        return null;
    }
}
