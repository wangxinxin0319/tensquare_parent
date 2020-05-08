package com.bw.dao;

import com.bw.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author wxx
 * @version 1.0
 * @date 2020/5/8 17:38
 */
public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {
    Label getById(String id);
}
