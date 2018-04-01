package com.ujs.spmsys.core;

import tk.mybatis.mapper.entity.Condition;
import java.util.List;

public interface CommonService<T> {
    void save(T entity);
    void deleteById(Integer id);
    void update(T model);//更新
    List<T> findAll();//获取所有
    T findById(Integer id);//通过ID查找
    List<T> findByCondition(Condition condition);//根据条件查找
}
