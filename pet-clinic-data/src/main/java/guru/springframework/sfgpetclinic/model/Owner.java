package guru.springframework.sfgpetclinic.model;

/**
 * @author Alfredo Sanz
 * @time dic. 2019
 **/
public class Owner extends Person {

    private Long id;

    public Owner(String firstName, String lastName, Long id) {
        super(firstName, lastName);
        this.id = id;
    }

}
