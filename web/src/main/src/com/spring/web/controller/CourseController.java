package com.spring.web.controller;

import com.spring.web.entity.CourseVO;
import com.spring.web.service.CourseService;
import com.spring.web.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@ResponseBody
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "courses", method = RequestMethod.GET)
    public List<CourseVO> selectCourses() {
        List<CourseVO> courseVOList = courseService.selectCurrentCourses();
        return courseVOList;
    }

    @RequestMapping(value = "courses1", method = RequestMethod.GET)
    public List<CourseVO> selectCourses1() {
        List<CourseVO> courseVOList = courseService.selectCurrentCourses1();
        return courseVOList;
    }
}
