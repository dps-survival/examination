package com.examination.sys.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 奕阳
 * @since 2022-11-21 09:16:00
 * 用于控制器类返回结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    /**
     *  请求状态
     */
    private boolean flag;
    /**
     *  状态码
     */
    private Integer code;
    /**
     *  消息提示
     */
    private String message;
    /**
     *  消息提示
     */
    private Object data;


    public static Result success(Integer code,String message,Object data){
        return new Result(true,code,message,data);
    }

    public static Result success(String message,Object data){
        return success(StatusCode.SUCCESS.getCode(),message,data);
    }

    public static Result success(Object data){
        return success(StatusCode.SUCCESS.getCode(),StatusCode.SUCCESS.getMessage(),data);
    }

    public static Result success(String message){
        return success(StatusCode.SUCCESS.getCode(),message,null);
    }

    public static Result success(){
        return success(StatusCode.SUCCESS.getMessage());
    }

    public static Result error(Integer code,String message,Object data){
        return new Result(false,code,message,data);
    }

    public static Result error(String message,Object data){
        return error(StatusCode.ERROR.getCode(),message,data);
    }

    public static Result error(Integer code,String message){
        return new Result(false,code,message,null);
    }

    public static Result error(String message){
        return error(StatusCode.ERROR.getCode(),message,null);
    }

    public static Result error(Object data){
        return error(StatusCode.ERROR.getCode(),StatusCode.ERROR.getMessage(),data);
    }

    public static Result error() {
        return error(StatusCode.ERROR.getCode(), StatusCode.ERROR.getMessage(), null);
    }

}
