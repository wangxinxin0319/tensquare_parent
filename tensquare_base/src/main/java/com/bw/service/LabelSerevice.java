package com.bw.service;

import com.bw.dao.LabelDao;
import com.bw.model.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utils.IdWorker;

import java.util.List;

/**
 * @author wxx
 * @version 1.0
 * @date 2020/5/8 17:39
 */
@Service
public class LabelSerevice {
    @Autowired
    private LabelDao dao;
    @Autowired
    private IdWorker idWorker;

    public Label getById(String id) {
        return dao.getById(id);
    }

    @Modifying
    @Transactional
    public void addLabel(Label label) {
        label.setId(idWorker.nextId()+"");
        dao.save(label);
    }

    /**
     * 查询全部
     * @return
     */
    public List<Label> queryAll() {
        return dao.findAll();
    }

    @Modifying
    @Transactional
    public Label updateByID(Label label) {
        //save判断如果id不存在  新增  存在 修改
        return dao.save(label);
    }
        @Modifying
    public void del(String id) {
        dao.deleteById(id);
    }
}
