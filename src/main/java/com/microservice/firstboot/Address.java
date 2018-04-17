package com.microservice.firstboot;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@ApiModel("用戶模型") // 未添加該註解無法產生Mapper，會有Server Internal Error
@AllArgsConstructor
@Getter
public class Address {
    private int id;
    private String province;
    private String city;
    private String country;
}
