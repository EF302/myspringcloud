package com.longwanli.feign;

import com.longwanli.entity.Student;
import com.longwanli.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Collection;

/**
 * feign声明式接口
 * 通过@FeignClient的fallback属性设置映射，实现降级处理，如果访问controller中方法失败，则去访问对应的错误处理方法。
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
