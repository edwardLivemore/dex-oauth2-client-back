package com.chinadep.dexoauth2clientback.controller;

import com.chinadep.dexoauth2clientback.vo.request.AuthCodeRequest;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "CodeController", value = "授权码管理")
@RestController
@RequestMapping("authCode")
@Slf4j
public class AuthCodeController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @PostMapping
    public void addCode(@RequestBody AuthCodeRequest request) {
        redisTemplate.opsForValue().set("auth_code", request.getAuthCode());
    }
}
