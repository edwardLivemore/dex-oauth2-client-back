package com.chinadep.dexoauth2clientback.api.service;

import com.chinadep.dexoauth2clientback.api.common.ApiResult;
import com.chinadep.dexoauth2clientback.api.resp.CompanyJobDetailResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="http://127.0.0.1:8091/darp", name="darp")
public interface RemoteCompanyJobService {
    @GetMapping("company/job/detail/{id}")
    ApiResult<CompanyJobDetailResp> detail(@PathVariable("id") Long id);
}
