package com.logan.demo.helloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class HelloCtrlTest {

    @Autowired
    private HelloWorld helloWorld;

    @Test
    void hello() {
        try {
            Assertions.assertNotEquals(helloWorld.helloWorld("Logan"), "", "Test case Fail!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}