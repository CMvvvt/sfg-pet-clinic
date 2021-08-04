package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;


/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/2 20:20
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
