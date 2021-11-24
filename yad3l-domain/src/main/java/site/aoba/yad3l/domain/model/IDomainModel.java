package site.aoba.yad3l.domain.model;

import java.io.Serializable;

public interface IDomainModel<TKey> extends Serializable {
    TKey getId();
}
