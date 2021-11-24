package site.aoba.yad3l.components.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> extends BaseMessage {
    private int statusCode;
    private String message;
    private T content;
}