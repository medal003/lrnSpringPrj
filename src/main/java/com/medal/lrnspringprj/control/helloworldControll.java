package com.medal.lrnspringprj.control;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meideng.zh <br/>
 * date: 2022/7/12 22:26 <br/>
 * comment: 
 */
@RestController
@Api(value = "测试模块")
public class helloworldControll {
    @GetMapping(value = "/testHelloWorld/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "api comment", notes = "api comment")
    public String testHelloWorld(@ApiParam(name = "id", value = "id", required = true) @PathVariable("id") String id) {
        return id+" hello world,medal";
    }
}
