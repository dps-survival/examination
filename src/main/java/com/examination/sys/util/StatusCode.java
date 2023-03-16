package com.examination.sys.util;

/**
 * @author 奕阳
 * @since 2022-11-21 09:16:00
 *
 */

public enum  StatusCode {
    /**
     *  请求成功
     */
    SUCCESS(200,"请求成功"),
    /**
     *  请求失败
     */
    ERROR(500,"请求失败"),
    /**
     *  登陆失败
     */
    LOGIN_ERROR(202,"登录失败"),
    /**
     * 权限不足
     */
    ACCESS_ERROR(203,"用户权限不足"),
    /**
     *  调用失败
     */
    REMOTE_ERROR(204,"远程调用失败"),
    /**
     *  重复操作
     */
    REP_ERROR(205,"重复操作");
    /**
     *  状态码
     */
    private Integer code;
    /**
     *  消息提示
     */
    private String message;

    StatusCode(Integer code,String message){
        this.code = code;
        this.message = message;
    }
    StatusCode(Integer code){
        this.code = code;
    }
    public Integer getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
}
