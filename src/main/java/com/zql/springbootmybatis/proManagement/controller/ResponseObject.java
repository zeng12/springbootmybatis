package com.zql.springbootmybatis.proManagement.controller;


public class ResponseObject {
    private Integer code;
    private String message;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public ResponseObject code(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseObject message(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResponseObject data(Object data) {
        this.data = data;
        return this;
    }
    public static ResponseObject success(){
        return new ResponseObject().code(200);
    }
    public static ResponseObject error(){
        return error(400);
    }
    public static ResponseObject error(Integer code){
        return new ResponseObject().code(code);
    }
}
