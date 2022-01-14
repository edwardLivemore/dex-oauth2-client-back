package com.chinadep.dexoauth2clientback.api.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CompanyJobDetailResp {
    @ApiModelProperty("服务类型")
    private String companyServiceType;

    @ApiModelProperty("当前大状态")
    private String status;

    @ApiModelProperty("当前小状态")
    private String logStatus;

    @ApiModelProperty("需方公司名称")
    private String demCompanyName;

    @ApiModelProperty("服务商公司名称")
    private String supCompanyName;

    @ApiModelProperty("服务商公司logo")
    private String logoPath;

    @ApiModelProperty("评估产品名称")
    private String productName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("评估方公司联系人名称")
    private String supCompanyContact;

    @ApiModelProperty("评估方公司联系人联系电话")
    private String supCompanyContactMobile;

    @ApiModelProperty("评估方公司联系人邮箱")
    private String supCompanyContactEmail;

    @ApiModelProperty("工单编号")
    private String jobNo;

    @ApiModelProperty("工单创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("工单更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("工单完成时间")
    private LocalDateTime doneTime;

    @ApiModelProperty("工单申请记录")
    private List<CompanyJobCommonLog> applicationLogs;

    @ApiModelProperty("工单评估记录")
    private List<CompanyJobEstimatingLog> estimatingLogs;

    @ApiModelProperty("工单完成记录")
    private CompanyJobCommonLog completeLog;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CompanyJobCommonLog {
        @ApiModelProperty("日志状态")
        private String status;

        @ApiModelProperty("创建时间")
        private LocalDateTime createTime;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class CompanyJobEstimatingLog extends CompanyJobCommonLog {
        @ApiModelProperty("日志ID")
        private Long id;

        @ApiModelProperty("审核意见")
        private String comment;

        @ApiModelProperty("文件名称")
        private String fileName;

        @ApiModelProperty("文件uuid")
        private String fileUUID;

        @ApiModelProperty("文件路径")
        private String filePath;
    }
}
