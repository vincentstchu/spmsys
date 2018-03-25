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

    @Override
    public void save(Reseacher model) {

    }

    @Override
    public void save(List<Reseacher> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Reseacher model) {

    }

    @Override
    public Reseacher findById(Integer id) {
        return null;
    }

    @Override
    public Reseacher findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Reseacher> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Reseacher> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Reseacher> findAll() {
        return null;
    }
}
