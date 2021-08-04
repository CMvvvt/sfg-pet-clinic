package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/4 17:30
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
