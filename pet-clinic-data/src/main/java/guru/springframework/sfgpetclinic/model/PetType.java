package guru.springframework.sfgpetclinic.model;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/1 23:00
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
