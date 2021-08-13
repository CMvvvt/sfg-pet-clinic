package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/13 12:49
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
