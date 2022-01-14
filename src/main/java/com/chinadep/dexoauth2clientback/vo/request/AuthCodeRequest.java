package com.chinadep.dexoauth2clientback.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AuthCodeRequest {
    @ApiModelProperty("授权码")
    private String authCode;
}
