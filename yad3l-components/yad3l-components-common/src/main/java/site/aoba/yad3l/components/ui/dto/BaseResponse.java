package site.aoba.yad3l.components.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BaseResponse<T> extends BaseMessage {
    private int statusCode;
    private String message;
    private Date sendDate;
    private T content;
}