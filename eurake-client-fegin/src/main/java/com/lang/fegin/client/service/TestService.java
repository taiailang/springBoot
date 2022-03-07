package com.lang.fegin.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;

/**
 * @author 浪浪
 * @date 2022/3/7
 */

@Service
@FeignClient(value = "service-ribbon")
public interface TestService {

    String test();
}
