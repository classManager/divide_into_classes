package com.baidu.controller;

import com.baidu.config.ThirdpartConfig;
import com.baidu.domain.UserInfo;
import com.baidu.exception.UserException;
import com.baidu.service.DivideService;
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
 *
 */
@RestController
@RequestMapping("/classes")
public class DivideController {
    @Autowired
    private RestTemplate template;

    @Autowired
    private DivideService divideService;
    @Autowired
    private ThirdpartConfig thirdpartConfig;


    @GetMapping(value = "/confirmStudents", produces = "application/json;charset=UTF-8")
    public Result confirmStudents(int schoolId,int gradeId, String classGroup) throws UserException {
        return divideService.ConfirmStudents(schoolId,gradeId, classGroup);
    }

    @GetMapping(value = "/getClassList", produces = "application/json;charset=UTF-8")
    public Result getClassList(int gradeId,int schoolId) throws UserException {
        return divideService.getClassList(gradeId, schoolId);
    }
}
