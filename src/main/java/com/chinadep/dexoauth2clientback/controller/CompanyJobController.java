package com.chinadep.dexoauth2clientback.controller;

import com.chinadep.dexoauth2clientback.api.resp.CompanyJobDetailResp;
import com.chinadep.dexoauth2clientback.api.service.RemoteCompanyJobService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "CompanyJobController", value = "工单管理")
@RestController
@RequestMapping("company/job")
@Slf4j
public class CompanyJobController {
    @Autowired
    private OAuth2RestTemplate oAuth2RestTemplate;

    @Autowired
    private RemoteCompanyJobService remoteCompanyJobService;

    @GetMapping("detail/{id}")
    public ResponseEntity<CompanyJobDetailResp> detail(@PathVariable("id") Long id) {
        ResponseEntity<CompanyJobDetailResp> entity =
                oAuth2RestTemplate.getForEntity("http://127.0.0.1:8091/darp/company/job/" + id, CompanyJobDetailResp.class);
        return entity;
    }
}
