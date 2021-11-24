package site.aoba.yad3l.domain.event;

import site.aoba.yad3l.domain.model.IAggregateRootModel;

import java.util.Date;
import java.util.UUID;

public interface IDomainEvent<TAggregateRoot extends IAggregateRootModel> {
    UUID getId();
    Date getCreatedTime();
    TAggregateRoot getSender();
}
