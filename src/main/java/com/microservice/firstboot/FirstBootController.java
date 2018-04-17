package com.microservice.firstboot;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("user相關API")
@RestController
@RequestMapping("/firstboot")
public class FirstBootController {

    @ApiOperation("根據ID獲取用戶訊息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int",
            required = true, value = "用戶的ID", defaultValue = "1")
    })
    @ApiResponses({
            @ApiResponse(code=400, message="請求參數沒填好"),
            @ApiResponse(code=404, message="無請求路慶或是頁面跳轉路徑不對")
    })
    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public User getUserInfo(@RequestParam("id") int id){
        if (id == 1){
            return new User(1, "小紅", "123456");
        }
        return new User(2, "小剛", "4354164");
    }

    @ApiOperation("獲取用戶住址")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int",
            required = true, value = "用戶的ID for address", defaultValue = "1")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "未填寫請求參數"),
            @ApiResponse(code = 403, message = "找不到該用戶的地址或是請求未寫好")
    })
    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public Address getUserAddress(@RequestParam("id") int id){
        return Address.builder().province("台灣").city("台中市").country("清水區").build();
    }
}
