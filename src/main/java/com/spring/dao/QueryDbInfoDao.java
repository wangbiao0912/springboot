package com.spring.dao;

import com.spring.model.CreateDb;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangbiao on 2017/1/11.
 */
public interface QueryDbInfoDao extends JpaRepository<CreateDb,Integer> {

}
