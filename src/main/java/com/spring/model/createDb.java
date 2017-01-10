package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by wangbiao on 2017/1/11.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class createDb {

    @Id
    @GeneratedValue
    //自增
    private Integer userId;

    private  String userName;
    private  String age;

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public createDb(String userName, String age) {
//        this.userName = userName;
//        this.age = age;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public createDb() {
//    }
}
