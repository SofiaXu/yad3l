package site.aoba.yad3l.domain.event;

import site.aoba.yad3l.domain.model.IAggregateRootModel;

import java.util.Collection;

public interface IDomainEventPublisher<TAggregateRoot extends IAggregateRootModel> {
    Collection<IDomainEvent<TAggregateRoot>> publishEvents();
    <TEvent extends IDomainEvent<TAggregateRoot>> void addEvent(TEvent event);
}
