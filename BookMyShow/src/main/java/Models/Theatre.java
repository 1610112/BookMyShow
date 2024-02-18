package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Theatre extends Base{

    @ManyToOne
    public Region region;

    //List<Screen> screenList;



}
