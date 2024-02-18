package Models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Show extends Base{
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Screen screen;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> featureList;
    /*create database bookmyshow;

create user bookmyshowuser;
grant all privileges on bookmyshow.* to bookmyshowuser;*/

}
