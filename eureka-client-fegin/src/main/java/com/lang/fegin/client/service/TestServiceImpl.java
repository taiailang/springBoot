package com.lang.fegin.client.service;

import org.springframework.stereotype.Service;

/**
 * @author 浪浪
 * @date 2022/3/7
 */

@Service
public class TestServiceImpl implements TestService{
    @Override
    public String test() {
        return "hello111";
    }
}
