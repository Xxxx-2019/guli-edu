package com.atguigu.eduservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class EduTeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> list() {
        return teacherService.list(null);
    }
}
