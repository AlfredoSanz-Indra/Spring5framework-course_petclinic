package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * @author Alfredo Sanz
 * @time dic. 2019
 **/
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
