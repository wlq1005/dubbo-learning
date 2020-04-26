package com.wlq.learning.provider.service.impl;

import com.wlq.learning.provider.service.DefaultDemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author wuliuqing
 * @date 2020/4/26 16:20
 **/
@Service(version = "${demo.service.version}")
public class DefaultDemoServiceImpl implements DefaultDemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
