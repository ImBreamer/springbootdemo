package com.breamer.demo.entity.primary;

import io.swagger.annotations.ApiModelProperty;

/**
 * 用户实体类
 * @author zhang.penghao
 * @date 2018/7/11 11:43
 */
public class User {
    @ApiModelProperty(value = "ID", name = "id")
    private Integer id;
    @ApiModelProperty(value = "姓名", name = "userName", required = true)
    private String userName;
    @ApiModelProperty(value = "密码", name = "userPassword", required = true)
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
