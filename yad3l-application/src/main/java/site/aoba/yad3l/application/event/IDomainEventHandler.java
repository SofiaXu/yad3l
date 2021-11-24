package site.aoba.yad3l.application.event;

import site.aoba.yad3l.domain.event.IDomainEvent;

public interface IDomainEventHandler<TEvent extends IDomainEvent> {
    void doHandle(TEvent event);
}
