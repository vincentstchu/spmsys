package com.ujs.spmsys.service.impl;

import com.ujs.spmsys.dao.ResearcherMapper;
import com.ujs.spmsys.entity.Researcher;
import com.ujs.spmsys.service.ResearcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

@Service
public class ResearcherServiceImpl implements ResearcherService {

    @Autowired
    ResearcherMapper researcherMapper;

    @Override
    public void save(Researcher entity) {
        researcherMapper.insert(entity);
    }

    @Override
    public void deleteById(Integer id) {
        researcherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Researcher entity) {
        researcherMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<Researcher> findAll() {
        return null;
    }

    @Override
    public Researcher findById(Integer id) {
        return researcherMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Researcher> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public Researcher findByName(String name) {
        return researcherMapper.selectByName(name);
    }
}
