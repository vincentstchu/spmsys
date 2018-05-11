package com.ujs.spmsys.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ujs.spmsys.dao.CrosappformMapper;
import com.ujs.spmsys.dao.CrossappfileMapper;
import com.ujs.spmsys.dao.CrossprojectMapper;
import com.ujs.spmsys.dao.FileMapper;
import com.ujs.spmsys.entity.Crosappform;
import com.ujs.spmsys.entity.Crossappfile;
import com.ujs.spmsys.entity.Crossproject;
import com.ujs.spmsys.entity.File;
import com.ujs.spmsys.service.ResCrosProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

@Service
public class ResCrosProjectServiceImpl implements ResCrosProjectService {

    @Autowired
    CrossprojectMapper crossprojectMapper;
    @Autowired
    CrosappformMapper crosappformMapper;
    @Autowired
    CrossappfileMapper crossappfileMapper;

    @Override
    public void save(Crossproject entity) {
        crossprojectMapper.insert(entity);
    }

    @Override
    public void deleteById(Integer id) {
        crossprojectMapper.deleteByPrimaryKey(id);
        if(crosappformMapper.selectByPrimaryKey(id) != null) {
            crosappformMapper.deleteByPrimaryKey(id);
        }
        if(crossappfileMapper.selectByPrimaryKey(id) !=null) {
            crossappfileMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void update(Crossproject model) {
        crossprojectMapper.updateByPrimaryKey(model);
    }

    @Override
    public List<Crossproject> findAll() {
        return crossprojectMapper.selectAll();
    }

    public Page<Crossproject> findAllP(int pageNum, int pageSize) {
        Page<Crossproject> page = PageHelper.startPage(pageNum,pageSize);
        crossprojectMapper.selectAll();
        return page;
    }

    @Override
    public Crossproject findById(Integer id) {
        return crossprojectMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Crossproject> findByCondition(Condition condition) {
        return null;
    }

    public List<Crossproject> findAllByAuthorName(String name) {
        return crossprojectMapper.selectByAuthorname(name);
    }
    //分页
    public Page<Crossproject> findAllByAuthorNameP(String name, int pageNum, int pageSize) {
        Page<Crossproject> page = PageHelper.startPage(pageNum, pageSize);
        crossprojectMapper.selectByAuthorname(name);
        return page;
    }


    @Override
    public Crossproject findAllByName(String name) {
        return crossprojectMapper.selectByName(name);
    }

    public List<Crossproject> findAllByStatus(Integer status) {
        return crossprojectMapper.selectByStatus(status);
    }

    public List<Crossproject> findAllByType(Integer type) {return crossprojectMapper.selectByType(type);}

    /*Crosappform*/
    public void saveForm(Crosappform crosappform) {
        crosappformMapper.insert(crosappform);
    }
    public Crosappform findByFormId(Integer id) {
        return crosappformMapper.selectByPrimaryKey(id);
    }

    /*Crossappfile*/
    public Crossappfile findByFileId(Integer id) {
        return crossappfileMapper.selectByPrimaryKey(id);
    }
    public void saveFile(Crossappfile file) {
        crossappfileMapper.insert(file);
        Crossproject crossproject = crossprojectMapper.selectByPrimaryKey(file.getId());
        if(crossproject != null) {
            crossproject.setStatus(3);
            crossprojectMapper.updateByPrimaryKey(crossproject);
        }
    }
    public void deleteFile(Integer id) {
        crossappfileMapper.deleteByPrimaryKey(id);
    }
}
