package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Alfredo Sanz
 * @time dic. 2019
 **/
public abstract class AbstractmapService <T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }


    T findByID(ID id) {
        return map.get(id);
    }


    T save(ID id, T object) {
        map.put(id, object);

        return object;
    }


    void deleteByID(ID id) {
        map.remove(id);
    }


    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
