package com.spring.service;

import com.spring.model.CreateDb;

import java.util.List;

/**
 * Created by wangbiao on 17-1-11.
 */
public interface QueryDb {
    /**
     * 查询数据库里面的数据
     */
    public List<CreateDb> queryAllCreare();
    public  void  addDb(CreateDb createDb);
}




