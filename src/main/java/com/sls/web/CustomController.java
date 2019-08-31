package com.sls.web;

import cn.gjing.result.ErrorResult;
import com.sls.domain.Custom;
import com.sls.service.CustomService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sls
 **/
@RestController
public class CustomController {

    @Resource
    private CustomService customService;

    @PostMapping("/custom")
    @ApiOperation(value = "添加用户", httpMethod = "POST")
    public ResponseEntity insertCustom(@RequestBody Custom custom) {
        boolean b = customService.insertCustom(custom);
        if (b) {
            return ResponseEntity.ok("ok");
        }
        return ResponseEntity.badRequest().body(ErrorResult.error("添加失败"));
    }

    @DeleteMapping("/custom/{id}")
    @ApiOperation(value = "删除用户", httpMethod = "DELETE")
    public ResponseEntity deleteCustom(@PathVariable("id") Integer id) {
        customService.deleteCustom(id);
        return ResponseEntity.ok("删除成功");
    }

    @GetMapping("/customs")
    @ApiOperation(value = "查询用户列表", httpMethod = "GET")
    public ResponseEntity findCustomList() {
        List<Custom> customs = customService.customList();
        return ResponseEntity.ok(customs);
    }

    @PutMapping("/csutom")
    @ApiOperation(value = "更新用户", httpMethod = "PUT")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "customId", value = "用户ID", dataType = "int", required = true, paramType = "QUery"),
            @ApiImplicitParam(name = "customName", value = "用户名", dataType = "String", required = true, paramType = "Query")
    })
    public ResponseEntity updateCustom(Integer customId, String customName) {
        boolean b = customService.updateCustom(customId, customName);
        if (b) {
            return ResponseEntity.ok("更新成功");
        }
        return ResponseEntity.badRequest().body(ErrorResult.error("更新失败"));
    }

}
