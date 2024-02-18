package Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends Base{
    private String screenName;
    @ManyToOne
    Theatre theatre;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    List<Feature> featuresList;
}
