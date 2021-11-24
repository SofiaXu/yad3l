package site.aoba.yad3l.components.ui.controller;

import site.aoba.yad3l.components.ui.dto.BaseResponse;

import java.util.Date;

public interface IController {
    default <T> BaseResponse<T> Ok(T content) {
        return new BaseResponse<>(200, "OK", new Date(), content);
    }

    default <T> BaseResponse<T> Error(int statusCode, String message, T content) {
        return new BaseResponse<>(statusCode, message, new Date(), content);
    }
}
