package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Alfredo Sanz
 * @time dic. 2019
 **/
@Service
public class PetServiceMap extends AbstractmapService<Pet, Long> implements PetService {

    @Override
    Pet save(Long aLong, Pet object) {
        return super.save(aLong, object);
    }

    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public Pet findByID(Long id) {
        return null;
    }

    @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public void deleteByID(Long id) {

    }
}
