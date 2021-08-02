package guru.springframework.sfgpetclinic.model;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/1 22:57
 */
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
