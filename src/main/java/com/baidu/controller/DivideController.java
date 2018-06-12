package com.baidu.controller;

import com.baidu.config.ThirdpartConfig;
import com.baidu.exception.UserException;
import com.baidu.service.DivideService;
import com.baidu.service.StudentBaseService;
import com.baidu.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private StudentBaseService studentBaseService;
    @Autowired
    private ThirdpartConfig thirdpartConfig;


    @GetMapping(value = "/confirmStudents", produces = "application/json;charset=UTF-8")
    public Result confirmStudents(int schoolId, int gradeId, String classGroup) throws UserException {
        return divideService.ConfirmStudents(schoolId, gradeId, classGroup);
    }

    @GetMapping(value = "/getClassList", produces = "application/json;charset=UTF-8")
    public Result getClassList(int gradeId, int schoolId) throws UserException {
        return divideService.getClassList(gradeId, schoolId);
    }
    @GetMapping(value = "/divideClass", produces = "application/json;charset=UTF-8")
    public Result divideClass(int schoolId,String gradeName) throws UserException {
        return divideService.divideClass(schoolId,gradeName);
    }

    @PostMapping(value = "/divideSecondClass", produces = "application/json;charset=UTF-8")
    public Result divideSecondClass(int schoolId,String gradeName,String[] Subject) throws UserException {
        return divideService.divideSecondClass(schoolId,gradeName,Subject);
    }
}
