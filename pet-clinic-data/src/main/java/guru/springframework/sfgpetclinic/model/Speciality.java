package guru.springframework.sfgpetclinic.model;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/11 22:10
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
