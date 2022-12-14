package com.yozuru.domain.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Yozuru
 */
@Getter
public enum HttpCodeEnum {

    // 成功
    SUCCESS(200,"操作成功"),
    // 登录
    NEED_LOGIN(401,"需要登录后操作"),
    NO_OPERATOR_AUTH(403,"无权限操作"),
    COMMENT_NOT_NULL(405,"评论内容不能为空"),
    FILE_TYPE_ERROR(406,"文件格式错误"),
    SYSTEM_ERROR(500,"系统出现错误"),
    USERNAME_EXIST(501,"用户名已存在"),
    PHONENUMBER_EXIST(502,"手机号已存在"),
    EMAIL_EXIST(503, "邮箱已存在"),
    ILLEGAL_PARAMETER(501,"参数格式错误！"),
    REQUIRE_USERNAME(504, "必需填写用户名"),
    LOGIN_ERROR(505,"用户名或密码错误");

    private final int code;
    private final String message;

    HttpCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
