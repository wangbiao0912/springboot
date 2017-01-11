package com.spring.service.iml;

import com.spring.dao.QueryDbInfoDao;
import com.spring.model.CreateDb;
import com.spring.service.QueryDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wangbiao on 17-1-11.
 */
@Service("QueryDbIml")
public class QueryDbIml implements QueryDb
{
    @Autowired
    private QueryDbInfoDao dao;
    @Override
    public List<CreateDb> queryAllCreare() {
        return dao.findAll();
    }

    //事务管理  自动的
    @Transactional
    @Override
    public void addDb(CreateDb createDb) {
        CreateDb c=new CreateDb();
        dao.save(c);
    }
}
