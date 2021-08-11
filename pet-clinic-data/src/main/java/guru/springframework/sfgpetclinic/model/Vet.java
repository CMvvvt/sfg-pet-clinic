package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/1 22:58
 */
public class Vet extends Person{

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
