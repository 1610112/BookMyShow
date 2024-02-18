package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends Base{
    @ManyToOne
    User user;
    BookingStatus bookingStatus;
    @OneToMany
    List<show_seat> showSeats;
    int amount;

    @OneToMany
    List<Payment> paymentList;

}
