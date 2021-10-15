package com.logan.demo.helloworld;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Logan Qin
 * @date 2021/10/15 13:43
 */

@Mapper
public interface HelloWorldMapper {


    List<String> helloWorld();

}
