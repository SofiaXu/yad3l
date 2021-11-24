package site.aoba.yad3l.components.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagedContent<T> extends BaseMessage {
    private int pageSize;
    private int pageIndex;
    private int totalPage;
    private long totalElement;
    private List<T> list;
}
