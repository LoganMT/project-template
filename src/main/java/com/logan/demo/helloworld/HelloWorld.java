package com.logan.demo.helloworld;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Logan Qin
 * @date 2021/10/15 11:36
 */

@Slf4j
@RestController
@RequestMapping("/hello/world")
public class HelloWorld {

    @Autowired
    private HelloWorldMapper helloWorldMapper;

    // localhost:9003/hello/world/Logan
    @GetMapping("/{name}")
    public String helloWorld(@PathVariable(value = "name") String name) {
        return "hello " + name + " !";
    }


    // localhost:9003/hello/world/database
    @GetMapping("/database")
    public String database() {
        String res = "";
        try {
            res = "Your database connection succeeded !  Data:  "
                    + new ObjectMapper().writeValueAsString(helloWorldMapper.helloWorld());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return res;
    }

}
