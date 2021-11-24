package site.aoba.yad3l.domain.repository;

import site.aoba.yad3l.domain.model.IDomainModel;

import java.util.List;
import java.util.function.Predicate;

public interface IRepository<TKey, TModel extends IDomainModel<TKey>> {
    TModel findById(TKey id);
    List<TModel> list(int pageIndex, int pageSize);
    List<TModel> find(Predicate<TModel> predicate, int pageIndex, int pageSize);
    TModel add(TModel model);
    List<TModel> addRange(List<TModel> models);
    int remove(TKey id);
    int removeRange(List<TKey> ids);
    TModel update(TModel model);
    List<TModel> updateRange(List<TModel> models);
}
