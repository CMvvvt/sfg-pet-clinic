package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/2 20:42
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
