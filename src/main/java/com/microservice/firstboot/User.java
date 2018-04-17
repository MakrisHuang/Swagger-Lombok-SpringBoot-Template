package com.microservice.firstboot;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ApiModel("用戶模型")
@AllArgsConstructor
@Getter
public class User {
    @ApiModelProperty("用戶 ID")
    private int id;
    @ApiModelProperty("用戶姓名")
    private String name;
    @ApiModelProperty("用戶密碼")
    private String password;
}
