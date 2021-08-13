package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/13 12:49
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
