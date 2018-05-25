package com.baidu.controller;

import com.baidu.domain.UserInfo;
import com.baidu.config.ThirdpartConfig;
import com.baidu.exception.UserException;
import com.baidu.service.UserInfoService;
import com.baidu.util.Result;
import com.baidu.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;

/**
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate template;

    @Autowired
    private ThirdpartConfig thirdpartConfig;

    @Autowired
    private UserInfoService userInfoService;
    @PostMapping(value = "/registeUser", produces = "application/json;charset=UTF-8")
    public Result registeUser(@Valid UserInfo userInfo, BindingResult bindingResult) throws UserException {
        if(bindingResult.hasErrors()){
            return ResultUtil.fail(1,  bindingResult.getFieldError().getDefaultMessage());
        }
//        JSONObject jsonObject = template.getForObject(thirdpartConfig.getOrg().get(ThirdpartConfig.tokenURL), JSONObject.class);
//        jsonObject.put("username", userInfo.getUsername());
//        jsonObject.put("password", userInfo.getPassword());
        int success = userInfoService.insertSelective(userInfo);
        return ResultUtil.success(success);
    }

    @GetMapping(value= "/login", produces= "application/json;charset=UTF-8")
    public Result loginUser(String username) throws UserException {
        List<UserInfo> list = userInfoService.selectByUsername(username);
        if(!CollectionUtils.isEmpty(list)){
            return ResultUtil.success(list.get(0));
        }else {
            return ResultUtil.success(null);
        }
    }
    @GetMapping(value= "/test", produces= "application/json;charset=UTF-8")
    public Result test(String username) throws UserException {

        if(!StringUtils.isEmpty(username)){
            return ResultUtil.success(username);
        }else {
            return ResultUtil.success(null);
        }
    }
}
