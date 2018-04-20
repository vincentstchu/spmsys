package com.ujs.spmsys.service.impl;

import com.ujs.spmsys.dao.CrossprojectMapper;
import com.ujs.spmsys.entity.Crossproject;
import com.ujs.spmsys.service.ResCrosProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

@Service
public class ResCrosProjectServiceImpl implements ResCrosProjectService {

    @Autowired
    CrossprojectMapper crossprojectMapper;

    @Override
    public void save(Crossproject entity) {
        crossprojectMapper.insert(entity);
    }

    @Override
    public void deleteById(Integer id) {
        crossprojectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Crossproject model) {

    }

    @Override
    public List<Crossproject> findAll() {
        return null;
    }

    @Override
    public Crossproject findById(Integer id) {
        return crossprojectMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Crossproject> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Crossproject> findAllByAuthorName(String name) {
        return crossprojectMapper.selectByAuthorname(name);
    }
}
