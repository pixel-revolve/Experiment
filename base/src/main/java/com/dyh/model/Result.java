package com.dyh.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 结果
 *
 * @author pixel-revolve
 * @date 2022/04/07
 */
@Data
public class Result<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    public T getData(){
        return this.data;
    }

    public Result(String message) {
        this.code = 1;
        this.message = message;
    }

    public Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public Result(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    public Result(ResultCode resultCode, T data,String message) {
        this.code = resultCode.getCode();
        this.message = message;
        this.data = data;
    }

    public static Result success() {
        return new Result(ResultCode.SUCCESS);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ResultCode.SUCCESS, data);
    }

    public static <T> Result<T> success(T data,String message) {
        return new Result<>(ResultCode.SUCCESS, data,message);
    }

    public static Result failure(ResultCode resultCode) {
        return new Result(resultCode);
    }

    public static <T> Result<T> failure(ResultCode resultCode, T data) {
        return new Result<>(resultCode, data);
    }

    public static Result failure(String message) {
        return new Result(message);
    }

    public static Result failure(ResultCode resultCode,String message) {
        return new Result(resultCode,message);
    }

}


