package guru.springframework.sfgpetclinic.boostrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Alfredo Sanz
 * @time dic. 2019
 **/
@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner("Alfredo", "Sanz", 1L);
        ownerService.save(owner1);

        Owner owner2 = new Owner("Fede", "juarez", 2L);
        ownerService.save(owner1);

        Vet vet1 = new Vet("Can", "you", 1L);
        vetService.save(vet1);

        Vet vet2 = new Vet("go", "home", 2L);
        vetService.save(vet2);


    }
}
