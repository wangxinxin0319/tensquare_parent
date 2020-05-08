package com.bw.controller;

import com.bw.model.Label;
import com.bw.service.LabelSerevice;
import entity.Result;
import entity.StatusCode;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wxx
 * @version 1.0
 * @date 2020/5/8 17:39
 */
@RestController
@RequestMapping("/label")
@CrossOrigin
public class LabelController {
    @Autowired
    private LabelSerevice impl;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") String id){
        Label label = impl.getById(id);
        return new Result(true, StatusCode.OK,"查询成功",label);
    }

    /**
     * 添加方法
     * @param label
     * @return
     */
    @PostMapping
    public Result addLabel(@RequestBody Label label){
        impl.addLabel(label);
        return new Result(true,StatusCode.OK,"添加成功");
    }


    /**
     * 查询全部
     * @return
     */
    @GetMapping
    public Result queryAll(){
        List<Label> labels = impl.queryAll();
        return new Result(true,StatusCode.OK,labels);
    }


    /**
     * 根据id修改
     * @param label
     * @param id
     * @return
     */
    @PutMapping("/{id}")
    public Result updateByID(@RequestBody Label label,@PathVariable("id") String id){
        label.setId(id);
        impl.updateByID(label);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    @DeleteMapping("/{id}")
    public Result del(@PathVariable("id") String id){
        impl.del(id);
        return new Result(true, StatusCode.OK,"删除成功！");
    }
}
