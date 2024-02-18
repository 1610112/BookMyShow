package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User extends Base{
    String userName;
    int contactNumber;
    String email;
    @OneToMany
    List<Booking> bookingList;

}
