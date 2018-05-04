package com.ujs.spmsys.service.impl;
import com.ujs.spmsys.dao.ItemMapper;
import com.ujs.spmsys.entity.Item;
import com.ujs.spmsys.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;

    @Override
    public void save(Item entity) {
        itemMapper.insert(entity);
    }

    @Override
    public void deleteById(Integer id) {
        itemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Item model) {
        itemMapper.updateByPrimaryKey(model);
    }

    @Override
    public List<Item> findAll() {
        return itemMapper.selectAll();
    }

    @Override
    public Item findById(Integer id) {
        return itemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Item> findByCondition(Condition condition) {
        return null;
    }

    public List<Item> findByAccountid(Integer accouontid) {
        return itemMapper.selectByAccountid(accouontid);
    }
}
