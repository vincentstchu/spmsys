package com.ujs.spmsys.service.impl;

import com.ujs.spmsys.dao.ReseacherMapper;
import com.ujs.spmsys.entity.Reseacher;
import com.ujs.spmsys.service.ReseacherService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

@Service
public class ReseacherServiceImpl implements ReseacherService{

    @Autowired
    ReseacherMapper reseacherMapper;

    @Override
    public void save(Reseacher entity) {
        reseacherMapper.insert(entity);
    }

    @Override
    public void deleteById(Integer id) {
        reseacherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Reseacher entity) {
        reseacherMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<Reseacher> findAll() {
        return null;
    }

    @Override
    public Reseacher findById(Integer id) {
        return reseacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Reseacher> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public Reseacher findByName(String name) {
        return reseacherMapper.findByName(name);
    }
}
