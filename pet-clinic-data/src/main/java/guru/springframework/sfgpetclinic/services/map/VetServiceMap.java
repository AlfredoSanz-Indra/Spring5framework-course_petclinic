package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Alfredo Sanz
 * @time dic. 2019
 **/
@Service
public class VetServiceMap extends AbstractmapService<Vet, Long> implements VetService {

    @Override
    Vet save(Long aLong, Vet object) {
        return super.save(aLong, object);
    }

    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public Vet findByID(Long id) {
        return null;
    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public void deleteByID(Long id) {

    }
}

