package com.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wangbiao on 2017/1/10.
 */

//@Controller  这个是返回页面的

@RestController
@Slf4j
public class EndCrontroller {

    /**
     * 新的方法
     * @param id
     * @return
     */
    @RequestMapping(value = "/{userid}/say" ,method = RequestMethod.GET)
    //@RequestMapping(value = "/say/{userid}" ,method = RequestMethod.GET)
    //@GetMapping(value = "say")
    //@PostMapping(value = "say")
    public  String say(@PathVariable("userid") Integer userid)
    {
        log.info("得到的id为："+userid);
        return "出来了；";
    }


    @RequestMapping(value = {"say2","hh"},method = RequestMethod.GET)
    public  String say2(@RequestParam(value = "userid",required = false,defaultValue = "0") Integer id)
    {
        //参数不必传  默认值2
        //注解的id必须为路径后面的userid保持一致
        log.info("得到的id为："+id);
        return "出来了；";
    }

}
