package com.examination.sys.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 奕阳
 * @since 2023-03-15 11:55:14
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
@ApiModel(value = "User对象", description = "")
public class User {

    @ApiModelProperty("用户id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户账号")
    @TableField("username")
    private String username;

    @ApiModelProperty("用户密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("用户名字")
    @TableField("uname")
    private String uname;

    @ApiModelProperty("性别(1男 0女)")
    @TableField("gender")
    private Integer gender;

    @ApiModelProperty("手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("1是 0 否")
    @TableField("is_admin")
    private Integer isAdmin;


}
