package com.breamer.demo.entity.secondary;

import io.swagger.annotations.ApiModelProperty;

/**
 * 学生测试表
 * @author breamer
 * @date 2018/7/25 14:22
 */
public class Student {
    private Long sId;
    @ApiModelProperty(value = "学生姓名", name = "sName", required = true)
    private String sName;
    @ApiModelProperty(value = "学生年龄", name = "sAge", required = true)
    private Integer sAge;

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }
}
