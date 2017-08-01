package com.github.superwen0001.demo.controller;

import com.github.superwen0001.demo.dto.StudentDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenshiliang on 2017/5/31.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/select")
    public List<StudentDto> select(){
        List<StudentDto> list = new ArrayList<>();
        StudentDto stu1 = new StudentDto("张三",30);
        StudentDto stu2 = new StudentDto("李四",40);
        list.add(stu1);
        list.add(stu2);
        return list;
    }
}
