package com.cchery.curso.springboot.webapp.springboot_web.models.dto;

public class ParamMixDto {
    private String message; Integer code;

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
