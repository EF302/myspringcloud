package com.longwanli.feign.impl;

import com.longwanli.entity.Student;
import com.longwanli.feign.FeignProviderClient;
import org.springframework.stereotype.Component;
import java.util.Collection;

/**
 * feign容错降级处理实现类
 */
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}