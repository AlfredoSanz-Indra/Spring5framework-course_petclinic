package guru.springframework.sfgpetclinic.model;

/**
 * @author Alfredo Sanz
 * @time dic. 2019
 **/
public class Vet extends Person {

    private Long id;

    public Vet(String firstName, String lastName, Long id) {
        super(firstName, lastName);
    }
}
