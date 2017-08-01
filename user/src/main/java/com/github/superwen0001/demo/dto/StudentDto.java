package com.github.superwen0001.demo.dto;

/**
 * Created by wenshiliang on 2017/5/31.
 */
public class StudentDto {
    private String name;
    private Integer age;

    public StudentDto() {
    }

    public StudentDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public StudentDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
